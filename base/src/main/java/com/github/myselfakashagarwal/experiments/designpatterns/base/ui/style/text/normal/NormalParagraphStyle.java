package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.normal;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public class NormalParagraphStyle extends TextStyle {
    public NormalParagraphStyle() {
        super("2px", "6px 0px", "#444444", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Paragraph Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
