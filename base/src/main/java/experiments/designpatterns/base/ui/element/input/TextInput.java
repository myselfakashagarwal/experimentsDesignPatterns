package experiments.designpatterns.base.ui.element.input;

import experiments.designpatterns.base.ui.interaction.input.TextInputInteractable;
import experiments.designpatterns.base.ui.style.input.InputStyle;

public class TextInput extends AbstractInput implements TextInputInteractable {

    public TextInput(InputStyle style) {
        super(style);
    }
}
