package io.github.jphwba.emerald_gear;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class Main implements ModInitializer {
	public static final String MOD_ID = "emerald_gear";
	@Override
	public void onInitialize() {
		ModItems.initialize();
	}
}