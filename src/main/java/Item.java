public class Item {
    public enum Category {
        Food, Clothing, Book, Stationery, Others
    }

    private String name;
    private int quantity;
    private double price;
    private Category category;

    public Item(String name, double price, int quantity, Category cat) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = cat;
    }

    String getName() {
        return this.name;
    }

    int getQuantity() {
        return this.quantity;
    }

    double getPrice() {
        return this.price;
    }

    Category getCategory() {
        return this.category;
    }
}
