package experiments.designpatterns.base.ui.style.input.retro;

import experiments.designpatterns.base.ui.style.input.InputStyle;

public class RetroTimeInputStyle extends InputStyle {
    public RetroTimeInputStyle() {
        super("12px", "6px", "#222222", "#C8C8C8");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro TimeInput Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
