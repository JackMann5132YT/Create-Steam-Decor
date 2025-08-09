package com.example.createsteamdecor.neoforge;

import com.example.createsteamdecor.CreateSteamDecor;
import net.neoforged.fml.common.Mod;

@Mod(CreateSteamDecor.MOD_ID)
public class CreateSteamDecorNeoForge {
    public CreateSteamDecorNeoForge() {
        CreateSteamDecor.registerContent();
    }
}
