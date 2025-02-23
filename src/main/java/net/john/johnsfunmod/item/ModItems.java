package net.john.johnsfunmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.john.johnsfunmod.JohnsFunMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHOCKING = registerItem("shocking", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(JohnsFunMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        JohnsFunMod.LOGGER.info("Registering Mod Items for " + JohnsFunMod.MOD_ID);

    }
}
