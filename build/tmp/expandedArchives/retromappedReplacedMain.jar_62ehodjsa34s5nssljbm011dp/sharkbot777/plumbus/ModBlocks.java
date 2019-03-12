package sharkbot777.plumbus;

import sharkbot777.plumbus.blocks.PlumbusBlock;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {


    @GameRegistry.ObjectHolder("plumbus:plumbusblock")
    public static PlumbusBlock plumbusBlock;





    @SideOnly(Side.CLIENT)
    public static void initModels() {

        plumbusBlock.initModel();

    }


}
