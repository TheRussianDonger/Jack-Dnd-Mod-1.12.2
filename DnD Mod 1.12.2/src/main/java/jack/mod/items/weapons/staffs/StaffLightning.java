package jack.mod.items.weapons.staffs;

import java.util.Random;
import jack.mod.Main;
import jack.mod.entity.hlightning.EntityHorizontalLightning;
import jack.mod.init.ItemInit;
import jack.mod.items.ItemBase;
import jack.mod.util.IHasModel;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.EntityStruckByLightningEvent;

public class StaffLightning extends ItemSword implements IHasModel{
	int durability = 9;
	
	public StaffLightning(String name, ToolMaterial material) 
	{
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.dndtab);
		
		ItemInit.ITEMS.add(this);
	}
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand)
	{
		ItemStack item = player.getHeldItem(hand);
		Vec3d aim = player.getLookVec();
		EntityHorizontalLightning lightning = new EntityHorizontalLightning(worldIn, 1.0d, 1.0d, 1.0d);
		lightning.setPosition(player.posX + aim.x * 1.5d, player.posY + aim.y * 1.5d, player.posZ + aim.z * 1.5d);
		lightning.shoot(player, player.rotationPitch, player.rotationYaw, 0.0f, 1.5f, 0.5f);
		if (!worldIn.isRemote)
		{
		worldIn.spawnEntity(lightning);	
		}
		worldIn.playSound(null, player.getPosition(), SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.PLAYERS, 0.5f, 0.5f);
		if(player.capabilities.isCreativeMode)
		{
			item.shrink(1);
		}
//		EntityLightningBolt lightningbolt = new EntityLightningBolt(worldIn, 1, 1, 1, bFull3D);
//		
//		lightningbolt.setPosition(player.posX + aim.x * 10, player.posY + aim.y * 4.5D, player.posZ + aim.z * 10);
//		worldIn.spawnEntity(lightningbolt);
//		lightningbolt.width = 20;
//		item.damageItem(1, player);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
	public int getMaxItemUseDuration(ItemStack stack)
    {
        
        if (durability == 0)
        {
        	Random rand = new Random();
        	int random = rand.nextInt(1);
        	random += 1;
        	
        	//int random = (int )(Math.random() * 1 + 1);
        	
        		if (random == 1)
        		{
        			
        			durability = 9;
        			return durability;
        		}
        		else
        		{
        			System.out.println("yes");        
        		}
        }
        		
        	 
        return durability;
    }
}
