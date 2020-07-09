import java.util.Arrays;
import java.util.HashSet;

public class States {
    public static StateTax CA = new StateTax(0.0975, new HashSet<>(Arrays.asList(Item.Category.Food)));
    public static StateTax NY = new StateTax(0.08875, new HashSet<>(Arrays.asList(Item.Category.Food, Item.Category.Clothing)));
}
