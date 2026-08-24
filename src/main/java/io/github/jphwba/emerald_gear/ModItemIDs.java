package io.github.jphwba.emerald_gear;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIDs {


    public static final ResourceKey<Item> EMERALD_PICKAXE = create("emerald_pickaxe");
    public static final ResourceKey<Item> EMERALD_AXE = create("emerald_axe");
    public static final ResourceKey<Item> EMERALD_SHOVEL = create("emerald_shovel");
    public static final ResourceKey<Item> EMERALD_HOE = create("emerald_hoe");
    public static final ResourceKey<Item> EMERALD_SWORD = create("emerald_sword");

    public static final ResourceKey<Item> EMERALD_HELMET = create("emerald_helmet");
    public static final ResourceKey<Item> EMERALD_CHESTPLATE = create("emerald_chestplate");
    public static final ResourceKey<Item> EMERALD_LEGGINGS = create("emerald_leggings");
    public static final ResourceKey<Item> EMERALD_BOOTS = create("emerald_boots");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name));
    }
}