package me.rebirthclient;

import me.rebirthclient.api.managers.Managers;
import me.rebirthclient.mod.gui.screen.Gui;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid="rebirth", name="RebirthMobile", version="alpha")
public class Rebirth {
    public static final Logger LOGGER = LogManager.getLogger("Rebirth");
    @Mod.Instance
    public static Rebirth INSTANCE;

    public static void load() {
        LOGGER.info("Loading Rebirth alpha Mobile...");
        Managers.load();
        if (Gui.INSTANCE == null) {
            Gui.INSTANCE = new Gui();
        }
        LOGGER.info("Rebirth alpha successfully loaded!\n");
    }

    public static void unload(boolean force) {
        LOGGER.info("Unloading Rebirth alpha...");
        Managers.unload(force);
        LOGGER.info("Rebirth alpha successfully unloaded!\n");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Rebirth.load();
    }
}

