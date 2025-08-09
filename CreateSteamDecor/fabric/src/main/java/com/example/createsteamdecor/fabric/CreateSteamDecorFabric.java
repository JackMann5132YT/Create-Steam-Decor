package com.example.createsteamdecor.fabric;

import com.example.createsteamdecor.CreateSteamDecor;
import net.fabricmc.api.ModInitializer;

public class CreateSteamDecorFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateSteamDecor.registerContent();
    }
}
