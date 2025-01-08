package org.example.refactoring.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void updateQuality_WhenNormalItem_DecreasesQualityByOne() {
        // given
        Item[] items = new Item[] { new Item("Normal item", 10, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(9, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenSellDatePassed_DecreasesQualityByTwo() {
        // given
        Item[] items = new Item[] { new Item("Normal item", -1, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenQualityIsZero_DoesNotDecreaseQuality() {
        // given
        Item[] items = new Item[] { new Item("Normal item", 10, 0) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenQualityIsFifty_DoesNotIncreaseQuality() {
        // given
        Item[] items = new Item[] { new Item("Aged Brie", 10, 50) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsAgedBrie_IncreasesQualityByOne() {
        // given
        Item[] items = new Item[] { new Item("Aged Brie", 10, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsSulfuras_DoesNothing() {
        // given
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 10, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[0].sellIn);
    }

    @Test
    void updateQuality_WhenItemIsBackstagePassesAndMaxTenDaysToSell_IncreasesQualityByTwo() {
        // given
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsBackstagePassesAndMaxFiveDaysToSell_IncreasesQualityByThree() {
        // given
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(13, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsBackstagePassesAndAfterConcert_DropsQualityToZero() {
        // given
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsConjuredItem_DecreasesQualityByTwo() {
        // given
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(8, app.items[0].quality);
    }

    @Test
    void updateQuality_WhenItemIsConjuredItemAndSellInPassed_DecreasesQualityByFour() {
        // given
        Item[] items = new Item[] { new Item("Conjured Mana Cake", -1, 10) };
        var app = new GildedRose(items);

        // when
        app.updateQuality();

        // then
        assertEquals(6, app.items[0].quality);
    }
}