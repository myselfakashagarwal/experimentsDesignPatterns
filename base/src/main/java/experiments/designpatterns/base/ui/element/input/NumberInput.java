package experiments.designpatterns.base.ui.element.input;

import experiments.designpatterns.base.ui.interaction.input.NumberInputInteractable;
import experiments.designpatterns.base.ui.style.input.InputStyle;

public class NumberInput extends AbstractInput implements NumberInputInteractable {

    public NumberInput(InputStyle style) {
        super(style);
    }
}
