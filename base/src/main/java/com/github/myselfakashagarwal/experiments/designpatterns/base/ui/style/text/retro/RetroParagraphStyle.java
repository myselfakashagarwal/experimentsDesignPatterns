package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.retro;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public class RetroParagraphStyle extends TextStyle {
    public RetroParagraphStyle() {
        super("4px", "8px 0px", "#555500", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Paragraph Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
