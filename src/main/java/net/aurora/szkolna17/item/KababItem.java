
package net.aurora.szkolna17.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

import java.util.List;

@Szkolna17ModElements.ModElement.Tag
public class KababItem extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:kabab")
	public static final Item block = null;
	public KababItem(Szkolna17ModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Szkolna17ModItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(10).saturation(5f).meat().build()));
			setRegistryName("kabab");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 64;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Pszny kabab ogu\u0142em"));
		}
	}
}
