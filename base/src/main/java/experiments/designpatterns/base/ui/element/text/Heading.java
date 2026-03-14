package experiments.designpatterns.base.ui.element.text;

import experiments.designpatterns.base.ui.interaction.text.HeadingInteractable;
import experiments.designpatterns.base.ui.style.text.TextStyle;

public class Heading extends AbstractText implements HeadingInteractable {

    public Heading(TextStyle style) {
        super(style);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering Heading...");
    }
}
