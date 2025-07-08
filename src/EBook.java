public class EBook extends Book{
    private String FileType;
    private int fileSize; // in MB

    public EBook(String title, String author, String isbn, int year, int price, String fileType) {
        super(title, author, isbn, year, price);
        this.FileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address){
        if(quantity > 0 && isForSale()) {
            System.out.println("Order placed for " + quantity + " copies of " + title + ". Email: " + email + ", Address: " + address);
            System.out.println("File type: " + FileType + ", Price per copy: " + price);
            MailService.send(email);
        } else {
            System.out.println("Invalid quantity or book not for sale.");
        }
    }
    @Override
    public boolean isForSale() {
        return true;
    }
}
