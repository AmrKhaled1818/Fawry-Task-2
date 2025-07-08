public class EBook extends Book{
    private String FileType;


    public EBook(String title, String author, String isbn, int year, int price, String fileType) {
        super(title, author, isbn, year, price);
        this.FileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address){
        if(quantity<= 0){
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        if(isForSale() ) {
            MailService.send(email);
            System.out.println("Order placed for " + quantity + " copies of " + title + ". Email: " + email + ", Address: " + address);
            System.out.println("File type: " + FileType);
        } else {
            System.out.println("This eBook is not available for sale.");
        }
    }

    @Override
    public boolean isForSale() {
        return true;
    }
}
