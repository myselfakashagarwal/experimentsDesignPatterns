package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class NormalTimeInputStyle extends InputStyle {
    public NormalTimeInputStyle() {
        super("6px", "3px", "#666666", "#f5f5f5");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal TimeInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
