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


    @test
    public void bar() {
        Item[] items = new Item[] { new Item("bar", 8, 19) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("lars", app.items[0].name);
    }

}
