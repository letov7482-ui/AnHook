package com.smoothframe.core;

public class FrameTimeSmoother {

    private static float smoothed = 0f;

    public static float smooth(float value) {
        smoothed = smoothed * 0.85f + value * 0.15f;
        return smoothed;
    }
}
