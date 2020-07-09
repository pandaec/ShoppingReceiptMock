import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void Case1() {
        Receipt receipt = new Receipt(States.CA);
        receipt.addItem(new Item("book", 17.99, 1, Item.Category.Book));
        receipt.addItem(new Item("potato chips", 3.99, 1, Item.Category.Food));

        Assert.assertEquals("21.98", receipt.calcSumSubTotalStr());
        Assert.assertEquals("1.80", receipt.calcTaxStr());
        Assert.assertEquals("23.78", receipt.calcTotalStr());

    }

    @Test
    public void Case2() {
        Receipt receipt = new Receipt(States.NY);
        receipt.addItem(new Item("book", 17.99, 1, Item.Category.Book));
        receipt.addItem(new Item("pencil", 2.99, 3, Item.Category.Stationery));

        Assert.assertEquals("26.96", receipt.calcSumSubTotalStr());
        Assert.assertEquals("2.40", receipt.calcTaxStr());
        Assert.assertEquals("29.36", receipt.calcTotalStr());
    }

    @Test
    public void Case3() {
        Receipt receipt = new Receipt(States.NY);
        receipt.addItem(new Item("pencil", 2.99, 2, Item.Category.Stationery));
        receipt.addItem(new Item("shirt", 29.99, 1, Item.Category.Clothing));

        Assert.assertEquals("35.97", receipt.calcSumSubTotalStr());
        Assert.assertEquals("0.55", receipt.calcTaxStr());
        Assert.assertEquals("36.52", receipt.calcTotalStr());
    }
}
