package org.example.refactoring.gildedrose;

public class AgedBrieStrategy implements ItemStrategy {

    @Override
    public void update(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        decreaseSellIn(item);
    }
}
