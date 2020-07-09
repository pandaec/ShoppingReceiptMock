import java.util.ArrayList;

public class Receipt {
    private ArrayList<Item> shoppingCart = new ArrayList<>();
    private StateTax stateTax;

    public Receipt(StateTax stateTax) {
        this.stateTax = stateTax;
    }

    public void addItem(Item item) {
        shoppingCart.add(item);
    }

    private double calcSubTotal() {
        double sum = 0;
        for (Item it : shoppingCart) {
            sum += it.getPrice() * it.getQuantity();
        }

        return sum;
    }

    private double calcTax() {
        double taxSum = 0;
        for (Item it : shoppingCart) {
            if (!stateTax.isExempted(it)) {
                taxSum += (it.getPrice() * it.getQuantity()) * stateTax.getTaxRate();
            }
        }

        return roundUpTax(taxSum);
    }

    private double calcTotal() {
        return calcSubTotal() + calcTax();
    }

    void print() {
        if (shoppingCart.isEmpty()) return;

        System.out.format("%-16s%8s%16s\n\n", "item", "price", "qty");

        for (Item it : shoppingCart) {
            System.out.format("%-16s%8.2f%16d\n", it.getName(), it.getPrice(), it.getQuantity());
        }

        System.out.format("%s%31s\n", "subtotal:", "$" + calcSumSubTotalStr());
        System.out.format("%s%36s\n", "tax:", "$" + calcTaxStr());
        System.out.format("%s%34s\n", "total:", "$" + calcTotalStr());
    }

    public String calcSumSubTotalStr() {
        return String.format("%.2f", calcSubTotal());
    }

    public String calcTaxStr() {
        return String.format("%.2f", calcTax());
    }

    public String calcTotalStr() {
        return String.format("%.2f", calcTotal());
    }

    // round to nearest 0.05
    private double roundUpTax(double x) {
        return Math.ceil(x * 20) / 20.0;
    }


}
