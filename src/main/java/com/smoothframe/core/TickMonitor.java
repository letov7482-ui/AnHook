package com.smoothframe.core;

public class TickMonitor {

    private static long lastTick = System.nanoTime();
    public static float tickMs = 0f;

    public static void init() {
        System.out.println("[SmoothFrame] TickMonitor активирован");
    }

    public static void onTick() {
        long now = System.nanoTime();
        tickMs = (now - lastTick) / 1_000_000f;
        lastTick = now;
    }
}
