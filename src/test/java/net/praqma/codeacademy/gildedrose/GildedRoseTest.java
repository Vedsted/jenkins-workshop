package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    /*
    * this is the test foo
    */
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


    @Test
    public void bar() {
        Item[] items = new Item[] { new Item("bar", 8, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("bar", app.items[0].name);
    }


    @Test
    public void lars() {
        Item[] items = new Item[] { new Item("Lars HoensIAsparges", 5, 1) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Lars HoensIAsparges", app.items[0].name);
    }

    @Test
    public void agedBrie() {
        Item[] items = new Item[] { new Item("aged brie", 5, 9) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("aged brie", app.items[0].name);
    }

    
    @Test
    public void unagedBrie() {
        Item[] items = new Item[] { new Item("unaged brie", 5, 9) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("unaged brie", app.items[0].name);
    }

}
