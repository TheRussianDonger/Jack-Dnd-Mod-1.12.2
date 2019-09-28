package jack.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(ItemInit.STEEL_INGOT, 1), 2.5f);
	}
}
