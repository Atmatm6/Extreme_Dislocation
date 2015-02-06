package ca.Atmatm6.Extremecore;

import ca.Atmatm6.extrelocate.erblock.EnderLapisOre;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import static ca.Atmatm6.Extremecore.ExtremeReferences.*;

@Mod(modid = coremodid, name = coreversion,version = corename)
public class ExtremeCore {
    public static Block enderLapisOre;
    public void preInit(FMLPreInitializationEvent fmlPreInitializationEvent)
    {
        enderLapisOre = new EnderLapisOre(Material.rock);
    }
}
