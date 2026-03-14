package experiments.designpatterns.base.ui.element.input;

import experiments.designpatterns.base.ui.interaction.input.DateInputInteractable;
import experiments.designpatterns.base.ui.style.input.InputStyle;

public class DateInput extends AbstractInput implements DateInputInteractable {

    public DateInput(InputStyle style) {
        super(style);
    }
}
