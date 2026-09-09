package com.smoothframe.ui.components;

import net.minecraft.client.util.math.MatrixStack;

public class WaveformGraph {

    private float lastY = 0f;

    public void render(MatrixStack matrices, int x, int y, float frameMs) {
        float height = Math.min(frameMs * 3f, 100f);
        lastY = lastY * 0.8f + height * 0.2f;

        fill(matrices, x, y + 100, x + 2, y + 100 - (int) lastY, 0xFF00FF00);
    }

    private void fill(MatrixStack matrices, int x1, int y1, int x2, int y2, int color) {
        net.minecraft.client.gui.DrawableHelper.fill(matrices, x1, y1, x2, y2, color);
    }
}
