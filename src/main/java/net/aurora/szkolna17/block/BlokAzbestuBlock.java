
package net.aurora.szkolna17.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.aurora.szkolna17.procedures.AzbestWykopanieProcedure;
import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.item.AzbestItem;
import net.aurora.szkolna17.Szkolna17ModElements;

import java.util.List;
import java.util.Collections;

@Szkolna17ModElements.ModElement.Tag
public class BlokAzbestuBlock extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:blok_azbestu")
	public static final Block block = null;
	public BlokAzbestuBlock(Szkolna17ModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(Szkolna17ModItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(25f, 1200f).lightValue(0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("blok_azbestu");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(AzbestItem.block, (int) (3)));
		}

		@Override
		public void onBlockClicked(BlockState state, World world, BlockPos pos, PlayerEntity entity) {
			super.onBlockClicked(state, world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				AzbestWykopanieProcedure.executeProcedure($_dependencies);
			}
		}

		@Override
		public void onEntityWalk(World world, BlockPos pos, Entity entity) {
			super.onEntityWalk(world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				AzbestWykopanieProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
