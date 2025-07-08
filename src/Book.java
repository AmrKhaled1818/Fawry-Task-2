public abstract class Book {
    protected String title;
    protected String author;
    protected String isbn;
    protected int year;
    protected int price;

    public Book(String title, String author, String isbn, int year, int price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public abstract void buy(int quantity, String email, String address);
    public abstract boolean isForSale();

    public boolean isOutdated(int currentYear, int thresholdYears) {
        return (currentYear - this.year) > thresholdYears;
    }

    //getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }


}
