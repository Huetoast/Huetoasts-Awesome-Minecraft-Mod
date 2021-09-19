
package net.mcreator.testestsetest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.testestsetest.TestestsetestModElements;

@TestestsetestModElements.ModElement.Tag
public class SowrdItem extends TestestsetestModElements.ModElement {
	@ObjectHolder("testestsetest:sowrd")
	public static final Item block = null;
	public SowrdItem(TestestsetestModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 6566;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 44442f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 62f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("sowrd"));
	}
}
