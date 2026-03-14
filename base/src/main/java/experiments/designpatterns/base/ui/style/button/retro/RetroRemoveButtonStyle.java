package experiments.designpatterns.base.ui.style.button.retro;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RetroRemoveButtonStyle extends ButtonStyle {
    public RetroRemoveButtonStyle() {
        super("14px", "9px", "#FF0000", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Remove Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
