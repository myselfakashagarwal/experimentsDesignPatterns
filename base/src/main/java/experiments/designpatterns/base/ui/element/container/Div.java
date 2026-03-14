package experiments.designpatterns.base.ui.element.container;

import experiments.designpatterns.base.ui.interaction.container.DivInteractable;
import experiments.designpatterns.base.ui.style.container.ContainerStyle;

public class Div extends AbstractContainer implements DivInteractable {

    public Div(ContainerStyle style) {
        super(style);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering Div container...");
    }
}
