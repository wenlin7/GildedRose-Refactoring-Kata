package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItem(item);
        }
    }

    private void updateItem(Item item) {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        if (item.name.equals("Aged Brie")) {
            item.sellIn = item.sellIn - 1;
            
            increaseQuality(item);
            if (item.sellIn < 0) {
                increaseQuality(item);
            }
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            item.sellIn = item.sellIn - 1;
            
            increaseQuality(item);

            if (item.sellIn < 10) {
                increaseQuality(item);
            }

            if (item.sellIn < 5) {
                increaseQuality(item);
            }
            
            if (item.sellIn < 0) {
                item.quality = item.quality - item.quality;
            }

        } else {
            item.sellIn = item.sellIn - 1;
            
            decreaseQuality(item);
            if (item.sellIn < 0) {
                decreaseQuality(item);
            }
        }
    }

    private void decreaseQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    private void increaseQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }
}