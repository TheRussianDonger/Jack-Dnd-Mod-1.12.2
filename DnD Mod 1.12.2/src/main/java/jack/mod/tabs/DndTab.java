package jack.mod.tabs;

import jack.mod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DndTab extends CreativeTabs
{
	public DndTab(String label)
	{
		super("dnd_tab");
		
	}
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.DND_ICON);
	}
	
	
}
