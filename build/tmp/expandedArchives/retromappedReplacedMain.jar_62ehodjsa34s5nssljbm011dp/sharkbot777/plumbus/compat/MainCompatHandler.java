package sharkbot777.plumbus.compat;

import sharkbot777.plumbus.compat.top.TOPCompatibility;
import net.minecraftforge.fml.common.Loader;

//import mcjty.plumbus.compat.waila.WailaCompatibility;
import net.minecraftforge.fml.common.Loader;

public class MainCompatHandler {

    public static void registerWaila() {
//        if (Loader.isModLoaded("Waila")) {
//            WailaCompatibility.register();
//        }
    }

    public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompatibility.register();
        }
    }

}
