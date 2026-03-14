package experiments.designpatterns.base.ui.style.input.normal;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class NormalDateInputStyle extends InputStyle {
    public NormalDateInputStyle() {
        super("6px", "3px", "#777777", "#f9f9f9");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal DateInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
