public class Main {
    public static void main(String[] args) {
        // Test Case 3
        Receipt receipt = new Receipt(States.NY);

        receipt.addItem(new Item("pencil", 2.99, 2, Item.Category.Stationery));
        receipt.addItem(new Item("shirt", 29.99, 1, Item.Category.Clothing));

        receipt.print();
    }
}
