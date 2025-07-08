import java.util.HashMap;
import java.util.*;

public class Inventory {
    private Map<String,Book> books = new HashMap<>();


    public void add(Book book){
        books.put(book.isbn,book);
        System.out.println("You have add: " + book.title + " To Inventory");
    }

    public void removeOutdatedBook(int currentYear, int thresholdYears) {
        Iterator<Map.Entry<String,Book>> iterator = books.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Book> entry = iterator.next();
            Book book = entry.getValue();
            if(book.isOutdated(currentYear,thresholdYears)){
                iterator.remove();
                System.out.println("Removed outdated book: " + book.title);
            }
        }
    }

    public void buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null) {
            throw new IllegalArgumentException("Book with ISBN " + isbn + " not found in inventory.");
        }
        if(!book.isForSale()) {
            throw new IllegalStateException("Book " + book.title + " is not for sale.");
        }
        book.buy(quantity, email, address);
    }

}
