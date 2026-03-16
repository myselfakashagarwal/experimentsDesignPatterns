package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.minimalist;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class MinimalistTextInputStyle extends InputStyle {
    public MinimalistTextInputStyle() {
        super("8px", "4px", "#cccccc", "#ffffff");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist TextInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
