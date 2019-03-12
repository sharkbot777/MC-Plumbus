package sharkbot777.plumbus.proxy;


import sharkbot777.plumbus.ModBlocks;
import sharkbot777.plumbus.blocks.PlumbusBlock;

import sharkbot777.plumbus.compat.MainCompatHandler;
import sharkbot777.plumbus.network.PacketHandler;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import sharkbot777.plumbus.Config;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "plumbus.cfg"));
        Config.readConfig();

        // Initialize our packet handler. Make sure the name is
        // 20 characters or less!
        PacketHandler.registerMessages("plumbus");

        // Initialization of blocks and items typically goes here:


        MainCompatHandler.registerWaila();
        MainCompatHandler.registerTOP();

    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {


        event.getRegistry().register(new PlumbusBlock());

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {




        event.getRegistry().register(new ItemBlock(ModBlocks.plumbusBlock).setRegistryName(ModBlocks.plumbusBlock.getRegistryName()));
    }

}
