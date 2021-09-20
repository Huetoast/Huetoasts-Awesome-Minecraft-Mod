package net.mcreator.testestsetest.world;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import net.mcreator.testestsetest.TestestsetestModElements;

import java.lang.reflect.Method;

@TestestsetestModElements.ModElement.Tag
public class AsdasdGameRule extends TestestsetestModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("asdasd", GameRules.Category.MOBS, create(false));
	public AsdasdGameRule(TestestsetestModElements instance) {
		super(instance, 104);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
