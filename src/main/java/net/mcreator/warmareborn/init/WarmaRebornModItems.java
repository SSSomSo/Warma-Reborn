/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.warmareborn.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.warmareborn.item.WuyaItem;
import net.mcreator.warmareborn.item.WomaArmorItem;
import net.mcreator.warmareborn.item.WarmaScareItem;
import net.mcreator.warmareborn.item.WarmaItem;
import net.mcreator.warmareborn.item.WarmaCoreItem;
import net.mcreator.warmareborn.item.SpiderZhiZhuItem;
import net.mcreator.warmareborn.item.SharkItem;
import net.mcreator.warmareborn.item.MantouItem;
import net.mcreator.warmareborn.item.LongShaMaItem;
import net.mcreator.warmareborn.item.DianyuanItem;
import net.mcreator.warmareborn.item.CakeIsALieItem;
import net.mcreator.warmareborn.item.AnotherFishingRodItem;
import net.mcreator.warmareborn.WarmaRebornMod;

public class WarmaRebornModItems {
	public static Item MANTOU;
	public static Item WARMA;
	public static Item WARMA_CORE;
	public static Item WOMA_ARMOR_HELMET;
	public static Item WOMA_ARMOR_CHESTPLATE;
	public static Item WOMA_ARMOR_LEGGINGS;
	public static Item WOMA_ARMOR_BOOTS;
	public static Item DIANYUAN;
	public static Item SPIDER_ZHI_ZHU;
	public static Item WUYA;
	public static Item CAKE_IS_A_LIE;
	public static Item ANOTHER_FISHING_ROD;
	public static Item LONG_SHA_MA;
	public static Item WARMA_SCARE;
	public static Item SHARK;

	public static void load() {
		MANTOU = register("mantou", new MantouItem());
		WARMA = register("warma", new WarmaItem());
		WARMA_CORE = register("warma_core", new WarmaCoreItem());
		WOMA_ARMOR_HELMET = register("woma_armor_helmet", new WomaArmorItem.Helmet());
		WOMA_ARMOR_CHESTPLATE = register("woma_armor_chestplate", new WomaArmorItem.Chestplate());
		WOMA_ARMOR_LEGGINGS = register("woma_armor_leggings", new WomaArmorItem.Leggings());
		WOMA_ARMOR_BOOTS = register("woma_armor_boots", new WomaArmorItem.Boots());
		DIANYUAN = register("dianyuan", new DianyuanItem());
		SPIDER_ZHI_ZHU = register("spider_zhi_zhu", new SpiderZhiZhuItem());
		WUYA = register("wuya", new WuyaItem());
		CAKE_IS_A_LIE = register("cake_is_a_lie", new CakeIsALieItem());
		ANOTHER_FISHING_ROD = register("another_fishing_rod", new AnotherFishingRodItem());
		LONG_SHA_MA = register("long_sha_ma", new LongShaMaItem());
		WARMA_SCARE = register("warma_scare", new WarmaScareItem());
		SHARK = register("shark", new SharkItem());
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(WarmaRebornMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
