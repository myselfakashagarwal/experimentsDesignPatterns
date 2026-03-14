package experiments.designpatterns.base.ui.element.input;

import experiments.designpatterns.base.ui.interaction.input.TimeInputInteractable;
import experiments.designpatterns.base.ui.style.input.InputStyle;

public class TimeInput extends AbstractInput implements TimeInputInteractable {

    public TimeInput(InputStyle style) {
        super(style);
    }
}
