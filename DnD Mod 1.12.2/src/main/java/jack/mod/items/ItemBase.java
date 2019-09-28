package jack.mod.items;

import jack.mod.Main;
import jack.mod.init.ItemInit;
import jack.mod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dndtab);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
