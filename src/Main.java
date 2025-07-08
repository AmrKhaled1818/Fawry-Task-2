public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book paperBook = new PaperBook("Java Basics", "Alice", "ISBN123", 2020, 100, 10);
        Book eBook = new EBook("Python Advanced", "Bob", "ISBN124", 2022, 50, "PDF");
        Book showcase = new Showcase("History of Books", "Charlie", "ISBN125", 2010, 0);

        inventory.add(paperBook);
        inventory.add(eBook);
        inventory.add(showcase);
        // Try buying paper book
        try {
            inventory.buyBook("ISBN123", 2, "buyer@example.com", "123 Book St.");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
        // Try buying ebook
        try {
            inventory.buyBook("ISBN124", 1, "reader@example.com", "");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
        // Try buying showcase book
        try {
            inventory.buyBook("ISBN125", 1, "user@example.com", "");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
        // Remove outdated books
        inventory.removeOutdatedBook(2025, 10);
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        // Buying non-existent book
        try {
            inventory.buyBook("ISBN999", 1, "someone@example.com", "Some Address");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
        // Buying more paper books than stock
        try {
            inventory.buyBook("ISBN123", 100, "buyer@example.com", "123 Book St.");
        } catch (Exception e) {
            System.out.println("Quantum book store: " + e.getMessage());
        }
        // Buying multiple copies of eBook
        try {
            inventory.buyBook("ISBN124", 5, "reader@example.com", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Buying with zero quantity
        try {
            inventory.buyBook("ISBN123", 0, "buyer@example.com", "123 Book St.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Buying with negative quantity
        try {
            inventory.buyBook("ISBN123", -1, "buyer@example.com", "123 Book St.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // Removing books with a very high threshold
        inventory.removeOutdatedBook(2025, 100);

        // Removing books with a zero threshold
        inventory.removeOutdatedBook(2025, 0);
    }
}
