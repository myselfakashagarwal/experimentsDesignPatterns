package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.retro;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class RetroNumberInputStyle extends InputStyle {
    public RetroNumberInputStyle() {
        super("12px", "6px", "#444444", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro NumberInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
