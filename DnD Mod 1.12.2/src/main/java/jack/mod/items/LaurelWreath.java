package jack.mod.items;

import jack.mod.Main;
import jack.mod.init.ItemInit;
import jack.mod.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class LaurelWreath extends ItemArmor implements IHasModel
{

	public LaurelWreath(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name)
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		ItemInit.ITEMS.add(this);
		setCreativeTab(Main.dndtab);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) 
	{
		if (stack.getItem() == ItemInit.Laurel_Wreath) 
				{
			effectPlayer(player, Potion.getPotionById(5), 10);
			effectPlayer(player, Potion.getPotionById(3), 10);
			effectPlayer(player, Potion.getPotionById(11), 10);
				}
		
		super.onArmorTick(world, player, stack);
	}
	
	private void effectPlayer(EntityPlayer entity, Potion potion, int amplifier) 
	{
	    //Always effect for 8 seconds, then refresh
	    if (entity.getActivePotionEffect(potion) == null || entity.getActivePotionEffect(potion).getDuration() <= 1)
	        entity.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
	}
	
	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

	
	
}
