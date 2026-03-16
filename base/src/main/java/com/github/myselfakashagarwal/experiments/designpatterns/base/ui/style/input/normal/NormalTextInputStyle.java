package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class NormalTextInputStyle extends InputStyle {
    public NormalTextInputStyle() {
        super("6px", "3px", "#999999", "#ffffff");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal TextInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
