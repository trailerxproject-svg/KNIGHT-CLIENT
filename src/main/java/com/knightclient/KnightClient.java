package com.knightclient;

import net.fabricmc.api.ClientModInitializer;

public class KnightClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("KNIGHT CLIENT loaded!");
    }
}
