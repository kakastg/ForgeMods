package com.kakastg.tutorial.items;

import com.kakastg.tutorial.Tutorial;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(Tutorial.TAB));
    }
}
