package experiments.designpatterns.base.ui.style.container.normal;

import experiments.designpatterns.base.ui.style.container.ContainerStyle;

public class NormalDivStyle extends ContainerStyle {
    public NormalDivStyle() {
        super("15px", "8px", "#808080", "#F5F5F5", "flex");
    }

    @Override
    public void apply() {
        System.out.println("Applying Normal Container Style:");
        System.out.println("Display: " + display);
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
