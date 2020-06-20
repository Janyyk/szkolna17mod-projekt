
package net.aurora.szkolna17.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.aurora.szkolna17.item.KononArmorItem;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class Szkolna17ubraniaItemGroup extends Szkolna17ModElements.ModElement {
	public Szkolna17ubraniaItemGroup(Szkolna17ModElements instance) {
		super(instance, 104);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabszkolna_1_7ubrania") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(KononArmorItem.body, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
