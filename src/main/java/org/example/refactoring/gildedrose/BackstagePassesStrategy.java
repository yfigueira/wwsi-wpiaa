package org.example.refactoring.gildedrose;

public class BackstagePassesStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 6) {
            item.quality += 3;
        } else if (item.sellIn < 11) {
            item.quality += 2;
        } else {
            item.quality++;
        }
        decreaseSellIn(item);
    }
}
