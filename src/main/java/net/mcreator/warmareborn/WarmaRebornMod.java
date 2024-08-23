/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.warmareborn;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.warmareborn.init.WarmaRebornModTabs;
import net.mcreator.warmareborn.init.WarmaRebornModProcedures;
import net.mcreator.warmareborn.init.WarmaRebornModPaintings;
import net.mcreator.warmareborn.init.WarmaRebornModItems;

import net.fabricmc.api.ModInitializer;

public class WarmaRebornMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "warma_reborn";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing WarmaRebornMod");

		WarmaRebornModTabs.load();

		WarmaRebornModItems.load();

		WarmaRebornModPaintings.load();
		WarmaRebornModProcedures.load();

	}
}
