package experiments.designpatterns.base.ui.style.button.normal;

import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class NormalAddButtonStyle extends ButtonStyle {
    public NormalAddButtonStyle() {
        super("5px", "2px", "#808080", "#E0E0E0");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Add Style:");
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
