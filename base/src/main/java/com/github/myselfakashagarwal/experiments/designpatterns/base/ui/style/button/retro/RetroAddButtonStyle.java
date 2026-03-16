package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.retro;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RetroAddButtonStyle extends ButtonStyle {
    public RetroAddButtonStyle() {
        super("15px", "10px", "#555555", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Add Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
