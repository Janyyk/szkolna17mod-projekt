
package net.aurora.szkolna17.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aurora.szkolna17.block.BlokAzbestuBlock;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class Szkolna17blocksItemGroup extends Szkolna17ModElements.ModElement {
	public Szkolna17blocksItemGroup(Szkolna17ModElements instance) {
		super(instance, 61);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabszkolna_1_7blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlokAzbestuBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
