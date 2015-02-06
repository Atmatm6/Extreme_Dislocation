package ca.Atmatm6.extrelocate.erblock;

import net.minecraft.block.material.Material;

public class EnderLapisOre extends ErBasicBlock{
    public EnderLapisOre(Material rock) {
        super(rock);
        this.setStepSound(soundTypeStone);
        this.dropBlockAsItem();
    }
}
