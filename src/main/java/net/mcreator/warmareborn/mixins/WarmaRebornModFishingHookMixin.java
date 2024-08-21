package net.mcreator.warmareborn.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.player.Player;

@Mixin(FishingHook.class)
public abstract class WarmaRebornModFishingHookMixin extends EntityMixin {
	@Inject(method = "shouldStopFishing", at = @At("HEAD"), cancellable = true)
	public void shouldStopFishing(Player player, CallbackInfoReturnable<Boolean> cir) {
		ItemStack itemStack = player.getMainHandItem();
		ItemStack itemStack2 = player.getOffhandItem();
		if (!player.isRemoved() && player.isAlive() && ((itemStack.getItem() instanceof FishingRodItem) || (itemStack2.getItem() instanceof FishingRodItem)) && this.distanceToSqr(player) < 1024.0) {
			cir.setReturnValue(false);
		}
	}
}
