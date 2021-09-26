
package net.mcreator.testestsetest;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.potion.PotionUtils;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.testestsetest.potion.FgdfgddPotion;
import net.mcreator.testestsetest.item.HeatedBruhBowlItem;

@TestestsetestModElements.ModElement.Tag
public class IljhkygkhBrewingRecipe extends TestestsetestModElements.ModElement {
	public IljhkygkhBrewingRecipe(TestestsetestModElements instance) {
		super(instance, 175);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.HONEY_BOTTLE;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == HeatedBruhBowlItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return PotionUtils.addPotionToItemStack(new ItemStack(Items.POTION), FgdfgddPotion.potionType);
			}
			return ItemStack.EMPTY;
		}
	}
}
