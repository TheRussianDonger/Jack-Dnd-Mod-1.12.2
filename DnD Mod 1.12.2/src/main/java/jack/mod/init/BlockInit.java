package jack.mod.init;

import java.util.ArrayList;
import java.util.List;

import jack.mod.blocks.BlockBase;
import jack.mod.blocks.CustomBlockLeaves;
import jack.mod.blocks.CustomBlockLog;
import jack.mod.blocks.CustomBlockSapling;
import jack.mod.blocks.SteelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block Molten_Block = new BlockBase("molten_block", Material.IRON);
	public static final Block Steel_Block = new SteelBlock("steel_block", Material.IRON);
	
	//Veni Vidi Vici
	public static final Block LOG_VICI = new CustomBlockLog("log_vici");
	public static final Block LEAVES_VICI = new CustomBlockLeaves("leaves_vici");
	public static final Block SAPPLING_VICI = new CustomBlockSapling("sappling_vici");

	
}
