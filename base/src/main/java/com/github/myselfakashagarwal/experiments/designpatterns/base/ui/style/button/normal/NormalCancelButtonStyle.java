package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class NormalCancelButtonStyle extends ButtonStyle {
    public NormalCancelButtonStyle() {
        super("5px", "2px", "#A0A0A0", "#F0F0F0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Cancel Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
