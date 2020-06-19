package net.aurora.szkolna17.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.aurora.szkolna17.item.KartonItem;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class WypicieMlekaProcedure extends Szkolna17ModElements.ModElement {
	public WypicieMlekaProcedure(Szkolna17ModElements instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure WypicieMleka!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(KartonItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
	}
}
