package com.example.createsteamdecor.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;

public class WhistleItem extends Item {
    public WhistleItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        if (!world.isClient && player != null) {
            world.playSound(null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.BLOCK_NOTE_BLOCK_BELL, SoundCategory.PLAYERS, 1.0f, 1.0f);
        }
        return true;
    }
}
