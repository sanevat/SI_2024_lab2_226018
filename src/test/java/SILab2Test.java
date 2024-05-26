import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    SILab2 SILab2 = new SILab2();

    @Test
    public void everyBranchTest() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 100));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("bread", null, 100, 0));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items1, 200));
        assertTrue(ex.getMessage().contains("No barcode!"));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("bread", "jk2", 100, 1));
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(items2, 0));
        assertTrue(ex.getMessage().contains("Invalid character"));

        List<Item> items3 = new ArrayList<>();
        items3.add(new Item("bread", "01", 50, 0.1f));
        assertTrue(SILab2.checkCart(items3, 500));


        List<Item> items4 = new ArrayList<>();
        items4.add(new Item("bread", "123", 500, 0.05f));
        assertFalse(SILab2.checkCart(items4, 10));

    }

    @Test
    void multipleConditionTest() {
        //F X X
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("bread", "165", 100, 0.2f));
        assertFalse(SILab2.checkCart(items1, 1));

        // T F X
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("bread", "165", 350, -0.02f));
        assertFalse(SILab2.checkCart(items2, 1));

        //T T F
        List<Item> items3 = new ArrayList<>();
        items3.add(new Item("bread", "165", 350, 0.2f));
        assertFalse(SILab2.checkCart(items3, 1));


        //T T T
        List<Item> items4 = new ArrayList<>();
        items3.add(new Item("bread", "0165", 400, 0.5f));
        assertTrue(SILab2.checkCart(items3, 2000));


    }
}