package org.example.refactoring.gildedrose;

public interface ItemStrategy {

    void update(Item item);

    default void decreaseSellIn(Item item) {
        item.sellIn--;
    }
}
