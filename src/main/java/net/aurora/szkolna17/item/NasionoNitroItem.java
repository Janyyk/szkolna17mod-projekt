
package net.aurora.szkolna17.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class NasionoNitroItem extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:nasiono_nitro")
	public static final Item block = null;
	public NasionoNitroItem(Szkolna17ModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Szkolna17ModItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(0).saturation(0f).setAlwaysEdible().build()));
			setRegistryName("nasiono_nitro");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
