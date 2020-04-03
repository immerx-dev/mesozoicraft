package immerx.mesozoicraft.init;

import java.util.ArrayList;
import java.util.List;

import immerx.mesozoicraft.objects.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block DEPOSIT_AMBER = new BlockBase("deposit_amber", Material.ROCK);
}
