public class Book {
    private String name;
    private String author;
    private double price;
    private int qty;

    public Book ( String name, String author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public String toString() {
        return "Book[name=" + name + ",author=" + author + ",price=" + price + ",qty=" + qty + "]";
    }
}
