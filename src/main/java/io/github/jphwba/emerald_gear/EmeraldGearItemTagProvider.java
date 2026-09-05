package io.github.jphwba.emerald_gear;

import io.github.jphwba.emerald_gear.armor.EmeraldArmorMaterial;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class EmeraldGearItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public EmeraldGearItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(ItemTags.SWORDS)
                .add(ModItemIDs.EMERALD_SWORD);
        builder(ItemTags.AXES)
                .add(ModItemIDs.EMERALD_AXE);
        builder(ItemTags.PICKAXES)
                .add(ModItemIDs.EMERALD_PICKAXE);
        builder(ItemTags.SHOVELS)
                .add(ModItemIDs.EMERALD_SHOVEL);
        builder(ItemTags.HOES)
                .add(ModItemIDs.EMERALD_HOE);

        builder(EmeraldArmorMaterial.REPAIRS_EMERALD_ARMOR)
                .add(ItemIds.EMERALD);
        builder(ItemTags.HEAD_ARMOR)
                .add(ModItemIDs.EMERALD_HELMET);
        builder(ItemTags.CHEST_ARMOR)
                .add(ModItemIDs.EMERALD_CHESTPLATE);
        builder(ItemTags.LEG_ARMOR)
                .add(ModItemIDs.EMERALD_LEGGINGS);
        builder(ItemTags.FOOT_ARMOR)
                .add(ModItemIDs.EMERALD_LEGGINGS);

    }
}
