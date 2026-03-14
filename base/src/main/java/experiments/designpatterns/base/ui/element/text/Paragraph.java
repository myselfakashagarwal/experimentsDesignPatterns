package experiments.designpatterns.base.ui.element.text;

import experiments.designpatterns.base.ui.interaction.text.ParagraphInteractable;
import experiments.designpatterns.base.ui.style.text.TextStyle;

public class Paragraph extends AbstractText implements ParagraphInteractable {

    public Paragraph(TextStyle style) {
        super(style);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering Paragraph...");
    }
}
