package org.example.refactoring.gildedrose;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (var item : items) {
            var strategy = getStrategy(item);
            strategy.update(item);
        }
    }

    private ItemStrategy getStrategy(Item item) {
        return switch (item.name) {
            case "Aged Brie" -> new AgedBrieStrategy();
            case "Backstage passes to a TAFKAL80ETC concert" -> new BackstagePassesStrategy();
            case "Sulfuras, Hand of Ragnaros" -> new SulfurasStrategy();
            case "Conjured Mana Cake" -> new ConjuredItemStrategy();
            default -> new NormalItemStrategy();
        };
    }
}
