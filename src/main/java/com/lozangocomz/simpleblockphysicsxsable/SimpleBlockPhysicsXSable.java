package com.lozangocomz.simpleblockphysicsxsable;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(SimpleBlockPhysicsXSable.MODID)
public class SimpleBlockPhysicsXSable {
    public static final String MODID = "simpleblockphysicsxsable";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SimpleBlockPhysicsXSable(IEventBus modEventBus, ModContainer modContainer) {
    }

    private void commonSetup(FMLCommonSetupEvent event) {
     }
}
