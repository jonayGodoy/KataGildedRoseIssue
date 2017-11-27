package test.java;

import static org.junit.Assert.*;

import main.java.GildedRose;
import main.java.Item;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);

        app.updateQuality();

        assertEquals("fixme", app.items[0].name);
    }

}
