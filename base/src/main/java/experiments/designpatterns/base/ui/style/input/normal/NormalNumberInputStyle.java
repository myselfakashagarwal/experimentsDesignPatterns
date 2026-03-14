package experiments.designpatterns.base.ui.style.input.normal;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class NormalNumberInputStyle extends InputStyle {
    public NormalNumberInputStyle() {
        super("6px", "3px", "#888888", "#fafafa");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal NumberInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
