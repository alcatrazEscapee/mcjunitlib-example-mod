package com.alcatrazescapee.mcjunitexample;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import com.alcatrazescapee.mcjunitlib.framework.IntegrationTestManager;

@Mod.EventBusSubscriber(modid = MCJUnitExampleMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class IntegrationTestEntryPoint
{
    @SubscribeEvent
    public static void setup(FMLCommonSetupEvent event)
    {
        IntegrationTestManager.setup(MCJUnitExampleMod.MOD_ID);
    }
}
