
package net.aurora.szkolna17.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aurora.szkolna17.item.MlekoItem;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class Szkolna17itemsItemGroup extends Szkolna17ModElements.ModElement {
	public Szkolna17itemsItemGroup(Szkolna17ModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabszkolna_1_7items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MlekoItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
