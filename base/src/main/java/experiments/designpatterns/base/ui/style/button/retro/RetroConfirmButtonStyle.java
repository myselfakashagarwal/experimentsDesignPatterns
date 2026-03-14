package experiments.designpatterns.base.ui.style.button.retro;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RetroConfirmButtonStyle extends ButtonStyle {
    public RetroConfirmButtonStyle() {
        super("20px", "10px", "#000080", "#C0C0C0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Confirm Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
