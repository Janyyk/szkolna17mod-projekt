
package net.aurora.szkolna17.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.aurora.szkolna17.item.AzbestItem;
import net.aurora.szkolna17.Szkolna17ModElements;

@Szkolna17ModElements.ModElement.Tag
public class AzbestOpalanieFuel extends Szkolna17ModElements.ModElement {
	public AzbestOpalanieFuel(Szkolna17ModElements instance) {
		super(instance, 60);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(AzbestItem.block, (int) (1)).getItem())
			event.setBurnTime(800);
	}
}
