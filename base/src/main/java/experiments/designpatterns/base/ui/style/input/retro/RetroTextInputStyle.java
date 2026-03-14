package experiments.designpatterns.base.ui.style.input.retro;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class RetroTextInputStyle extends InputStyle {
    public RetroTextInputStyle() {
        super("12px", "6px", "#555555", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro TextInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
