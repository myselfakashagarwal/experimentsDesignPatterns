package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class NormalRemoveButtonStyle extends ButtonStyle {
    public NormalRemoveButtonStyle() {
        super("5px", "2px", "#FF4500", "#FFF0F5");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Remove Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
