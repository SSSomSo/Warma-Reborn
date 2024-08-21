
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warmareborn.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.warmareborn.WarmaRebornMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class WarmaRebornModTabs {
	public static ResourceKey<CreativeModeTab> TAB_WARMA_REBORN = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(WarmaRebornMod.MODID, "warma_reborn"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_WARMA_REBORN,
				FabricItemGroup.builder().title(Component.translatable("item_group." + WarmaRebornMod.MODID + ".warma_reborn")).icon(() -> new ItemStack(WarmaRebornModItems.WARMA)).build());
	}
}
