package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.minimalist;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public class MinimalistHeadingStyle extends TextStyle {
    public MinimalistHeadingStyle() {
        super("0px", "8px 0px", "#000000", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Heading Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
