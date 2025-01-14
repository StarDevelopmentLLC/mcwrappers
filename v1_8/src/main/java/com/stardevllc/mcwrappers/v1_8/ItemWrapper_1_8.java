package com.stardevllc.mcwrappers.v1_8;

import com.stardevllc.mcwrappers.base.AttributeModifierWrapper;
import com.stardevllc.mcwrappers.base.ItemWrapper;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;

public class ItemWrapper_1_8 implements ItemWrapper {
    
    @Override
    public void addAttributeModifier(ItemMeta itemMeta, String attribute, AttributeModifierWrapper wrapper) {
        //no-op (for now)
    }

    @Override
    public Map<String, AttributeModifierWrapper> getAttributeModifiers(ItemStack itemStack) {
        return Map.of();
    }
}