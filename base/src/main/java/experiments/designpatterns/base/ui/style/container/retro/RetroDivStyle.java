package experiments.designpatterns.base.ui.style.container.retro;

import experiments.designpatterns.base.ui.style.container.ContainerStyle;

public class RetroDivStyle extends ContainerStyle {
    public RetroDivStyle() {
        super("30px", "15px", "#555555", "#C0C0C0", "block");
    }

    @Override
    public void apply() {
        System.out.println("Applying Retro Container Style:");
        System.out.println("Display: " + display);
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
