package experiments.designpatterns.base.ui.style.container.minimalist;

import experiments.designpatterns.base.ui.style.container.ContainerStyle;

public class MinimalistDivStyle extends ContainerStyle {
    public MinimalistDivStyle() {
        super("20px", "10px", "#eeeeee", "#ffffff", "block");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Container Style:");
        System.out.println("Display: " + display);
        System.out.println("Padding: " + padding);
        System.out.println("Margin: " + margin);
        System.out.println("Border Color: " + borderColor);
        System.out.println("Background Color: " + backgroundColor);
    }
}
