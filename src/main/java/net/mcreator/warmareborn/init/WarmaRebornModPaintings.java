
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warmareborn.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.warmareborn.WarmaRebornMod;

public class WarmaRebornModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_2"), new PaintingVariant(64, 36));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_1"), new PaintingVariant(64, 36));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_3"), new PaintingVariant(64, 36));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_4"), new PaintingVariant(32, 32));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_5"), new PaintingVariant(64, 64));
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(WarmaRebornMod.MODID, "wp_6"), new PaintingVariant(64, 36));
	}
}
