package jack.mod.client;

import jack.mod.gui.GuiUpdatedInventory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Event 
{

	
	
	@SubscribeEvent
	public static void openGui(GuiOpenEvent event)
	{
		if(event.getGui() instanceof GuiInventory) event.setGui(new GuiUpdatedInventory(Minecraft.getMinecraft().player));
	}
}
