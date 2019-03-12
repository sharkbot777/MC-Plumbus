package sharkbot777.plumbus;


import sharkbot777.plumbus.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Plumbus.MODID, name = Plumbus.MODNAME, version = Plumbus.MODVERSION, dependencies = "required-after:forge@[13.19.0.2129,)", useMetadata = true)
public class Plumbus {

    public static final String MODID = "plumbus";
    public static final String MODNAME = "Plumbus mod";
    public static final String MODVERSION = "0.0.1";

    @SidedProxy(clientSide = "sharkbot777.plumbus.proxy.ClientProxy", serverSide = "sharkbot777.plumbus.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Plumbus instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }


}
