package org.example.refactoring.gildedrose;

public class NormalItemStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            item.quality = item.sellIn < 0 ? item.quality - 2 : item.quality - 1;
        }
        decreaseSellIn(item);
    }
}
