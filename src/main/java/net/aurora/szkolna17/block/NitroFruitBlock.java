
package net.aurora.szkolna17.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.aurora.szkolna17.itemgroup.Szkolna17blocksItemGroup;
import net.aurora.szkolna17.item.NasionoNitroItem;
import net.aurora.szkolna17.Szkolna17ModElements;

import java.util.List;
import java.util.Collections;

@Szkolna17ModElements.ModElement.Tag
public class NitroFruitBlock extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:nitro_fruit")
	public static final Block block = null;
	public NitroFruitBlock(Szkolna17ModElements instance) {
		super(instance, 43);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(Szkolna17blocksItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.GOURD).sound(SoundType.BAMBOO).hardnessAndResistance(1f, 10f).lightValue(0));
			setRegistryName("nitro_fruit");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(NasionoNitroItem.block, (int) (3)));
		}
	}
}
