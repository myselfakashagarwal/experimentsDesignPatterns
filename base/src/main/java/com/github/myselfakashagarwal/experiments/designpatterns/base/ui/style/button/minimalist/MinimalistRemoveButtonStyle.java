package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.minimalist;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class MinimalistRemoveButtonStyle extends ButtonStyle {
    public MinimalistRemoveButtonStyle() {
        super("9px", "4px", "#cc0000", "#ffdddd");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Remove Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
