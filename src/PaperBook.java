public class PaperBook extends Book{
    private int stock;


    public PaperBook(String title, String author, String isbn, int year, int price, int stock) {
        super(title, author, isbn, year, price);
        this.stock = stock;
    }

    @Override
    public void buy(int quantity, String email, String address){
        if(quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
        if(quantity <= stock && isForSale()) {
            stock -= quantity;
            ShippingService.send(address);
            System.out.println("Order placed for " + quantity + " copies of " + title + ". Email: " + email + ", Address: " + address);
        } else {
            System.out.println("Insufficient stock or book not for sale.");
        }
    }
    @Override
    public boolean isForSale() {
        return stock > 0;
    }

}
