package dinoMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FossilBlock extends BlockBase{
	public FossilBlock(String name, Material material) {
		super(name,material);
		setSoundType(SoundType.METAL);
		setHardness(20.0F);
		setResistance(1000.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
	}
}