
package net.mcreator.testestsetest.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.testestsetest.item.BruhItem;

@Mod.EventBusSubscriber
public class XzcFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == BruhItem.block)
			event.setBurnTime(1600);
	}
}
