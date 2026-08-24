package io.github.jphwba.emerald_gear;

import io.github.jphwba.emerald_gear.armor.EmeraldArmorMaterial;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public class ModItems {

    public static final TagKey<Block> INCORRECT_FOR_EMERALD_TOOL = TagKey.create(Registries.BLOCK,
            Identifier.fromNamespaceAndPath(Main.MOD_ID, "incorrect_for_emerald_tool"));

    public static final ToolMaterial EMERALD_TOOL_MATERIAL = new ToolMaterial(
            INCORRECT_FOR_EMERALD_TOOL, // incorrect blocks for drops
            455, // durability
            5.0F, // speed
            0F, // attack damage bonus
            22, // enchantment value
            EmeraldArmorMaterial.REPAIRS_EMERALD_ARMOR // repair items
    );
    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static final Item EMERALD_PICKAXE = register(
            ModItemIDs.EMERALD_PICKAXE,
            Item::new,
            new Item.Properties().pickaxe(EMERALD_TOOL_MATERIAL, 5.0f, 1f)
    );

    public static final Item EMERALD_AXE = register(
            ModItemIDs.EMERALD_AXE,
            settings -> new AxeItem(EMERALD_TOOL_MATERIAL, 10.0F, -2.0F, settings),
            new Item.Properties()
    );

    public static final Item EMERALD_SHOVEL = register(
            ModItemIDs.EMERALD_SHOVEL,
            settings -> new ShovelItem(EMERALD_TOOL_MATERIAL, 5.0F, -2.0F, settings),
            new Item.Properties()
    );

    public static final Item EMERALD_HOE = register(
            ModItemIDs.EMERALD_HOE,
            settings -> new HoeItem(EMERALD_TOOL_MATERIAL, 5.0F, -2.0F, settings),
            new Item.Properties()
    );

    public static final Item EMERALD_SWORD = register(
            ModItemIDs.EMERALD_SWORD,
            Item::new,
            new Item.Properties().sword(EMERALD_TOOL_MATERIAL, 7.5f, 1f)
    );

    // Armor

    public static final Item EMERALD_HELMET = register(
            ModItemIDs.EMERALD_HELMET,
            Item::new,
            new Item.Properties().humanoidArmor(EmeraldArmorMaterial.INSTANCE, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(EmeraldArmorMaterial.BASE_DURABILITY))
    );

    public static final Item EMERALD_CHESTPLATE = register(
            ModItemIDs.EMERALD_CHESTPLATE,
            Item::new,
            new Item.Properties().humanoidArmor(EmeraldArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(EmeraldArmorMaterial.BASE_DURABILITY))
    );

    public static final Item EMERALD_LEGGINGS = register(
            ModItemIDs.EMERALD_LEGGINGS,
            Item::new,
            new Item.Properties().humanoidArmor(EmeraldArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(EmeraldArmorMaterial.BASE_DURABILITY))
    );

    public static final Item EMERALD_BOOTS = register(
            ModItemIDs.EMERALD_BOOTS,
            Item::new,
            new Item.Properties().humanoidArmor(EmeraldArmorMaterial.INSTANCE, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(EmeraldArmorMaterial.BASE_DURABILITY))
    );


    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_PICKAXE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_AXE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_SHOVEL));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_HOE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_SWORD));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_HELMET));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_CHESTPLATE));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_LEGGINGS));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT)
                .register((creativeTab) -> creativeTab.accept(ModItems.EMERALD_BOOTS));


    }
}