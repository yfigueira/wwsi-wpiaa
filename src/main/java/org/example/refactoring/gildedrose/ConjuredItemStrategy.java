package org.example.refactoring.gildedrose;

public class ConjuredItemStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
        if (item.quality > 0) {
            item.quality = item.sellIn < 0 ? item.quality - 4 : item.quality - 2;
        }
        decreaseSellIn(item);
    }
}
