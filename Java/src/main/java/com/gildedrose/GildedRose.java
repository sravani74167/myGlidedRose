// Online Java Compiler
// Use this editor to write, compile and run your Java code online
package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            
            //Quality Control
            //Normal Items
            if(!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")
                    && !items[i].name.equals("Sulfuras, Hand of Ragnaros")
                    && !items[i].name.equals("Conjured"))
                    {
                        if (items[i].quality > 0) {
                        items[i].quality = items[i].quality - 1;
                        }
                    }
            //AgedBrie or Backstage
            else if(items[i].name.equals("Aged Brie")
                    || items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;    
                    }
                    //Backstage only
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            
            //Conjured
            else if(items[i].name.equals("Conjured")){
                if (items[i].quality > 1) {
                        items[i].quality = items[i].quality - 2;
                        }
            }
            //Sulfuras
            else{
                //No action needed
            }
            
            //Sell In Control - for all items except Sulfuras
            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            //Sell In passed
            if (items[i].sellIn < 0) {
                //Normal item
                 if(!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")
                    && !items[i].name.equals("Sulfuras, Hand of Ragnaros")
                    && !items[i].name.equals("Conjured"))
                    {
                        if (items[i].quality > 0) {
                        items[i].quality = items[i].quality - 1;
                        }
                    }
                //BackStage
                 else if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                     items[i].quality = 0;
                     } 
                //AgedBrie
                 else if(items[i].name.equals("Aged Brie"){
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    } 
                 }
                 //Conjured
                 else if(items[i].name.equals("Conjured")){
                      if (items[i].quality > 1) {
                        items[i].quality = items[i].quality - 2;
                        }
                 }
                //Sulfuras
                 else{
                    //No action needed
                }
            }
        }
    }
}
