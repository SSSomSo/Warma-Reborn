package net.mcreator.warmareborn.mixins;

import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.client.renderer.entity.FishingHookRenderer;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.PoseStack;

@Mixin(FishingHookRenderer.class)
public abstract class WarmaRebornModFishingHookRendererMixin {
	private int offset;

	@Inject(method = "render", at = @At("HEAD"))
	public void render(FishingHook fishingHook, float f, float g, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, CallbackInfo ci) {
		Player player = fishingHook.getPlayerOwner();
		ItemStack itemStack = player.getMainHandItem();
		offset = player.getMainArm() == HumanoidArm.RIGHT ? 1 : -1;
		if (!(itemStack.getItem() instanceof FishingRodItem)) {
			offset = -offset;
		}
	}

	@ModifyVariable(method = "render", at = @At("STORE"), ordinal = 1)
	private int injected(int x) {
		return offset;
	}
}
