package experiments.designpatterns.base.ui.style.input.minimalist;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class MinimalistTimeInputStyle extends InputStyle {
    public MinimalistTimeInputStyle() {
        super("8px", "4px", "#dddddd", "#f5f5f5");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist TimeInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
