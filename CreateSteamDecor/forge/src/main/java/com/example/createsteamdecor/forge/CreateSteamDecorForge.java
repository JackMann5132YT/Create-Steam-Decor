package com.example.createsteamdecor.forge;

import com.example.createsteamdecor.CreateSteamDecor;
import net.minecraftforge.fml.common.Mod;

@Mod(CreateSteamDecor.MOD_ID)
public class CreateSteamDecorForge {
    public CreateSteamDecorForge() {
        CreateSteamDecor.registerContent();
    }
}
