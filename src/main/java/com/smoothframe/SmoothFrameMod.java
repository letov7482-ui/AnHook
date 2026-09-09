package com.smoothframe;

import net.fabricmc.api.ModInitializer;

public class SmoothFrameMod implements ModInitializer {

    public static final String MOD_ID = "smoothframe";

    @Override
    public void onInitialize() {
        System.out.println("[SmoothFrame] Инициализация движка стабилизации...");
        FrameTimeCollector.init();
        TickMonitor.init();
    }
}
