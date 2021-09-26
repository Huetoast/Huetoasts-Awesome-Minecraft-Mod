
package net.mcreator.testestsetest.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.testestsetest.itemgroup.TersuItemGroup;
import net.mcreator.testestsetest.TestestsetestModElements;

import java.util.List;
import java.util.Collections;

@TestestsetestModElements.ModElement.Tag
public class GtttttttttttttttttttttttttttttttttttttttttttttttttttttttttPlanksBlock extends TestestsetestModElements.ModElement {
	@ObjectHolder("testestsetest:gttttttttttttttttttttttttttttttttttttttttttttttttttttttttt_planks")
	public static final Block block = null;
	public GtttttttttttttttttttttttttttttttttttttttttttttttttttttttttPlanksBlock(TestestsetestModElements instance) {
		super(instance, 148);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TersuItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(2f, 3f).setLightLevel(s -> 0).harvestLevel(0)
					.harvestTool(ToolType.AXE).setRequiresTool());
			setRegistryName("gttttttttttttttttttttttttttttttttttttttttttttttttttttttttt_planks");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 5;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
