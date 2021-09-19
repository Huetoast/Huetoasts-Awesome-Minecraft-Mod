package net.mcreator.testestsetest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.testestsetest.TestestsetestMod;

import java.util.Map;

public class AfsEffectStartedappliedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TestestsetestMod.LOGGER.warn("Failed to load dependency entity for procedure AfsEffectStartedapplied!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LEVITATION, (int) 60, (int) 20, (false), (false)));
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).startFallFlying();
		}
	}
}
