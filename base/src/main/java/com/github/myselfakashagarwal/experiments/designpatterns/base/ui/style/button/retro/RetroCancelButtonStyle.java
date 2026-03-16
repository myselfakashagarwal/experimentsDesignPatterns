package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.retro;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RetroCancelButtonStyle extends ButtonStyle {
    public RetroCancelButtonStyle() {
        super("12px", "8px", "#800000", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Cancel Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
