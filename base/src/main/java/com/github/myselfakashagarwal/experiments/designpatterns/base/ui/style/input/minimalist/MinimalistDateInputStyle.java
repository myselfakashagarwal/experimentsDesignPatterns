package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.minimalist;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class MinimalistDateInputStyle extends InputStyle {
    public MinimalistDateInputStyle() {
        super("8px", "4px", "#bbbbbb", "#f9f9f9");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist DateInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
