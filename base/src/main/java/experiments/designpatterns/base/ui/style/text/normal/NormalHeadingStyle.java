package experiments.designpatterns.base.ui.style.text.normal;

import experiments.designpatterns.base.ui.style.text.TextStyle;

public class NormalHeadingStyle extends TextStyle {
    public NormalHeadingStyle() {
        super("4px", "10px 0px", "#111111", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Heading Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
