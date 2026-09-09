package com.smoothframe.core;

public class FrameTimeCollector {

    private static long lastFrameTime = System.nanoTime();
    public static float currentFrameMs = 0f;

    public static void init() {
        System.out.println("[SmoothFrame] Collector активирован");
    }

    public static void onFrame() {
        long now = System.nanoTime();
        currentFrameMs = (now - lastFrameTime) / 1_000_000f;
        lastFrameTime = now;
        FrameTimeAnalyzer.push(currentFrameMs);
    }
}
