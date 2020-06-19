
package net.aurora.szkolna17.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class Kubek2Item extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:kubek_2")
	public static final Item block = null;
	public Kubek2Item(Szkolna17ModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Szkolna17ModItemGroup.tab).maxStackSize(64));
			setRegistryName("kubek_2");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
