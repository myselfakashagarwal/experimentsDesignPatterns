package experiments.designpatterns.base.ui.style.input.minimalist;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class MinimalistNumberInputStyle extends InputStyle {
    public MinimalistNumberInputStyle() {
        super("8px", "4px", "#aaaaaa", "#fafafa");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist NumberInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
