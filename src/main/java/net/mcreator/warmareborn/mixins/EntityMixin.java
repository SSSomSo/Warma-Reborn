package net.mcreator.warmareborn.mixins;

import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.Entity;

@Mixin(Entity.class)
public abstract class EntityMixin {
	@Shadow
	public abstract void discard();

	@Shadow
	public abstract double distanceToSqr(Entity entity);
}
