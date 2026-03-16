package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class NormalConfirmButtonStyle extends ButtonStyle {
    public NormalConfirmButtonStyle() {
        super("6px", "3px", "#404040", "#D0D0D0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Confirm Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
