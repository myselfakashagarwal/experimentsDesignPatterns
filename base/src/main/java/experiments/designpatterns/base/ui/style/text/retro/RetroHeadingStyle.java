package experiments.designpatterns.base.ui.style.text.retro;

import experiments.designpatterns.base.ui.style.text.TextStyle;

public class RetroHeadingStyle extends TextStyle {
    public RetroHeadingStyle() {
        super("6px", "12px 0px", "#000080", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Heading Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
