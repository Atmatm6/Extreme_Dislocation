package ca.Atmatm6.extrelocate;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import static ca.Atmatm6.Extremecore.ExtremeReference.*;

@Mod(modid = modid,name = name,version = version,dependencies = deps)
public class ExtremeRelocation {
    public static final CreativeTabs tabRelocate;

    static {
        tabRelocate = new CreativeTabs(CreativeTabs.getNextID(), "relocatusextremus") {
            private static final String __OBFID = "Extreme Relocation";
            @SideOnly(Side.CLIENT)
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.command_block);
            }
        };
    }
}