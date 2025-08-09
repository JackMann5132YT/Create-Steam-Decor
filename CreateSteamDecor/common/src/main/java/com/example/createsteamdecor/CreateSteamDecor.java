package com.example.createsteamdecor;

import com.example.createsteamdecor.item.WhistleItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CreateSteamDecor {
    public static final String MOD_ID = "createsteamdecor";
    public static final Item WHISTLE = new WhistleItem(new Item.Settings().maxCount(1));

    public static void registerContent() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "whistle"), WHISTLE);
    }
}
