
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

import net.aurora.szkolna17.itemgroup.Szkolna17itemsItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

import java.util.List;

@Szkolna17ModElements.ModElement.Tag
public class KapusniaczekItem extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:kapusniaczek")
	public static final Item block = null;
	public KapusniaczekItem(Szkolna17ModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Szkolna17itemsItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(6).saturation(5f).build()));
			setRegistryName("kapusniaczek");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 60;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Dobry z kapustkom"));
		}
	}
}
