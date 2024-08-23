package net.mcreator.warmareborn.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.warmareborn.init.WarmaRebornModItems;

public class ScareWarmaProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(WarmaRebornModItems.WARMA)) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(WarmaRebornModItems.WARMA);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(WarmaRebornModItems.WARMA_SCARE);
				_setstack.setCount(1);
				_player.getInventory().add(_setstack);
			}
		}
	}
}
