package jack.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SteelBlock extends BlockBase
{
	public SteelBlock(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.METAL);
		setHardness(5.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
	  //setLightLevel(3.0f);
		setLightOpacity(0);
	  //setBlockUnbreakable();
	}

}
