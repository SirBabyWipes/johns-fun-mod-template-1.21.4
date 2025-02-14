package net.john.johnsfunmod;

import net.fabricmc.api.ModInitializer;

import net.john.johnsfunmod.block.ModBlocks;
import net.john.johnsfunmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnsFunMod implements ModInitializer {
    public static final String MOD_ID = "johns-fun-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}