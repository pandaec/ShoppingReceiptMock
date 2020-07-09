import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class StateTax {
    private double taxRate;
    private Set<Item.Category> exemptCat;

    StateTax(double taxRate, Set<Item.Category> exemptCat) {
        this.taxRate = taxRate;
        this.exemptCat = exemptCat;
    }

    double getTaxRate() {
        return taxRate;
    }

    boolean isExempted(Item item) {
        return exemptCat.contains(item.getCategory());
    }


}

