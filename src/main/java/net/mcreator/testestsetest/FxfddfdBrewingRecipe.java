
package net.mcreator.testestsetest;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.testestsetest.item.HlkItem;
import net.mcreator.testestsetest.item.BruhBowlItem;

@TestestsetestModElements.ModElement.Tag
public class FxfddfdBrewingRecipe extends TestestsetestModElements.ModElement {
	public FxfddfdBrewingRecipe(TestestsetestModElements instance) {
		super(instance, 172);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.BOWL;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == HlkItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(BruhBowlItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
