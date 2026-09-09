package com.smoothframe.core;

import java.util.ArrayDeque;

public class FrameTimeAnalyzer {

    private static final ArrayDeque<Float> buffer = new ArrayDeque<>(120);

    public static void push(float ms) {
        if (buffer.size() >= 120) buffer.removeFirst();
        buffer.addLast(ms);
    }

    public static float getAverage() {
        float sum = 0f;
        for (float ms : buffer) sum += ms;
        return buffer.isEmpty() ? 0f : sum / buffer.size();
    }

    public static float getLast() {
        return buffer.peekLast() == null ? 0f : buffer.peekLast();
    }
}
