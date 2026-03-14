package experiments.designpatterns.base.ui.style.button.minimalist;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class MinimalistCancelButtonStyle extends ButtonStyle {
    public MinimalistCancelButtonStyle() {
        super("8px", "4px", "#333333", "#EEEEEE");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Cancel Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
