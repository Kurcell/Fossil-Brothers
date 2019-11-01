package dinoMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FossilOre extends BlockBase{
	public FossilOre(String name, Material material) {
		super(name,material);
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 1);
	}

}
