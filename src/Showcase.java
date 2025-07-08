public class Showcase extends Book {

    public Showcase(String title, String author, String isbn, int year, int price) {
        super(title, author, isbn, year, price);
    }

    @Override
    public void buy(int quantity, String email, String address) {
        System.out.println("This is a showcase book. No purchase available.");
    }

    @Override
    public boolean isForSale() {
        return false; // Showcase books are not for sale
    }
}
