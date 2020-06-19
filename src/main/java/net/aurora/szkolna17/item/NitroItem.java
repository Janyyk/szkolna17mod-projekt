
package net.aurora.szkolna17.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.aurora.szkolna17.procedures.WypicieNitraProcedure;
import net.aurora.szkolna17.itemgroup.Szkolna17ModItemGroup;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class NitroItem extends Szkolna17ModElements.ModElement {
	@ObjectHolder("szkolna17:nitro")
	public static final Item block = null;
	public NitroItem(Szkolna17ModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(Szkolna17ModItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(1).saturation(0.1f).setAlwaysEdible().build()));
			setRegistryName("nitro");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.DRINK;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemStack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemStack, world, entity);
			int x = (int) entity.getPosX();
			int y = (int) entity.getPosY();
			int z = (int) entity.getPosZ();
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				WypicieNitraProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
