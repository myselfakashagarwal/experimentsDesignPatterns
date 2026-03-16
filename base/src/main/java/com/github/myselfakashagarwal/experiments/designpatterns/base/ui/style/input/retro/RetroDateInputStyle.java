package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.retro;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class RetroDateInputStyle extends InputStyle {
    public RetroDateInputStyle() {
        super("12px", "6px", "#333333", "#D0D0D0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro DateInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
