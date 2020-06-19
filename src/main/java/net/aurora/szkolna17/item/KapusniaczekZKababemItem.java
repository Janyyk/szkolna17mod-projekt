
package net.aurora.szkolna17.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.aurora.szkolna17.procedures.KapusniaczekZKababemItemIsCraftedsmeltedProcedure;
import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

import java.util.List;

@Szkolna17ModElements.ModElement.Tag
public class KapusniaczekZKababemItem extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:kapusniaczek_z_kababem")
	public static final Item block = null;
	public KapusniaczekZKababemItem(Szkolna17ModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Szkolna17ModItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(18).saturation(10f).build()));
			setRegistryName("kapusniaczek_z_kababem");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 80;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Pi\u0119knie utuszony"));
		}

		@Override
		public void onCreated(ItemStack itemstack, World world, PlayerEntity entity) {
			super.onCreated(itemstack, world, entity);
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				KapusniaczekZKababemItemIsCraftedsmeltedProcedure.executeProcedure($_dependencies);
			}
		}
	}
}
