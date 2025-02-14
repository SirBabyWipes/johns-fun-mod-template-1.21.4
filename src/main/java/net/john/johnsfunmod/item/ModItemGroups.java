package net.john.johnsfunmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.john.johnsfunmod.JohnsFunMod;
import net.john.johnsfunmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SUPER_COOL_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(JohnsFunMod.MOD_ID, "super_cool_mod_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHOCKING))
                    .displayName(Text.translatable("itemgroup.johnsfunmod.shocking"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SHOCKING);
                        entries.add(ModBlocks.SHOCKING_ORE);
                    }).build());

    public static void registerItemGroups() {
        JohnsFunMod.LOGGER.info("Registering Item Groups for " + JohnsFunMod.MOD_ID);
    }
}
