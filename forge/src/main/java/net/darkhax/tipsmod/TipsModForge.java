package net.darkhax.tipsmod;

import net.darkhax.bookshelf.api.Services;
import net.darkhax.tipsmod.impl.Constants;
import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class TipsModForge {

    public TipsModForge() {

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> IExtensionPoint.DisplayTest.IGNORESERVERONLY, (a, b) -> true));

        if (Services.PLATFORM.isPhysicalClient()) {

            TipsModForgeClient.init();
        }
    }
}