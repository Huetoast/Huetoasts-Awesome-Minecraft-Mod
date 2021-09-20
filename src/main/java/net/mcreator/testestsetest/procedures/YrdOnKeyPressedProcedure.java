package net.mcreator.testestsetest.procedures;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.testestsetest.TestestsetestMod;

import java.util.Map;

public class YrdOnKeyPressedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TestestsetestMod.LOGGER.warn("Failed to load dependency entity for procedure YrdOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		((LivingEntity) entity).getAttribute(Attributes.MAX_HEALTH)
				.setBaseValue((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) + 1));
	}
}
