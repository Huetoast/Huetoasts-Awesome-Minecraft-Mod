
package net.mcreator.testestsetest;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import net.mcreator.testestsetest.item.CakeballItem;
import net.mcreator.testestsetest.item.CakeBallMoldItem;

@TestestsetestModElements.ModElement.Tag
public class SaBrewingRecipe extends TestestsetestModElements.ModElement {
	public SaBrewingRecipe(TestestsetestModElements instance) {
		super(instance, 38);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == CakeBallMoldItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == CakeballItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(CakeballItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
