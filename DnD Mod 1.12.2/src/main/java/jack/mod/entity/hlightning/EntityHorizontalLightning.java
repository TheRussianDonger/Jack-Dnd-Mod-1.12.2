package jack.mod.entity.hlightning;

import javax.swing.text.Position;

import jack.mod.util.IHasModel;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityHorizontalLightning extends EntityThrowable implements IHasModel
{
	public EntityHorizontalLightning(World worldIn) 
	{
		super(worldIn);
		
	}
	
	public EntityHorizontalLightning(World worldIn, EntityLivingBase throwerIn) 
	{
		super(worldIn, throwerIn);
		
	}
	
	public EntityHorizontalLightning(World worldIn, double x, double y, double z) 
	{
		super(worldIn, x ,y, z);
		
	}
	@Override
	protected void onImpact(RayTraceResult result) 
	{
		if (!world.isRemote)
		{
			setDead();
			result.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.thrower), rand.nextFloat());
			if(result.entityHit instanceof EntityLivingBase)
			{
				EntityLivingBase entity = (EntityLivingBase)result.entityHit;
				entity.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS));
			}
		}
	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		
	}


	
	
	
	
}
