package com.smoothframe.ui;

import com.smoothframe.core.FrameTimeAnalyzer;
import com.smoothframe.ui.components.WaveformGraph;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class SmoothFrameScreen extends Screen {

    private final WaveformGraph graph = new WaveformGraph();

    public SmoothFrameScreen() {
        super(Text.literal("SmoothFrame Monitor"));
    }

    @Override
    public void render(net.minecraft.client.util.math.MatrixStack matrices, int mouseX, int mouseY, float delta) {
        super.render(matrices, mouseX, mouseY, delta);

        graph.render(matrices, 20, 20, FrameTimeAnalyzer.getLast());
    }
}
