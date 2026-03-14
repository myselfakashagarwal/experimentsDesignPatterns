package experiments.designpatterns.base.ui.style.button.minimalist;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class MinimalistAddButtonStyle extends ButtonStyle {
    public MinimalistAddButtonStyle() {
        super("10px", "5px", "#000000", "#FFFFFF");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Add Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
