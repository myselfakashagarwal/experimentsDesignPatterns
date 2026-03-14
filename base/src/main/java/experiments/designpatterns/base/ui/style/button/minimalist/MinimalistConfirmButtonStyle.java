package experiments.designpatterns.base.ui.style.button.minimalist;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class MinimalistConfirmButtonStyle extends ButtonStyle {
    public MinimalistConfirmButtonStyle() {
        super("12px", "6px", "#1a1a1a", "#eeeeee");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Confirm Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
