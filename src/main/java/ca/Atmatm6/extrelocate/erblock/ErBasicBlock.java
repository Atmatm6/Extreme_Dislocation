package ca.Atmatm6.extrelocate.erblock;

import ca.Atmatm6.extrelocate.ExtremeRelocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ErBasicBlock extends Block{
    protected ErBasicBlock(Material rock) {
        super(Material.rock);
        this.setCreativeTab(ExtremeRelocation.tabRelocate);
    }
}
