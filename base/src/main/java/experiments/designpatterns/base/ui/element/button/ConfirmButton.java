package experiments.designpatterns.base.ui.element.button;

import experiments.designpatterns.base.ui.interaction.button.ConfirmButtonInteractable;
import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class ConfirmButton extends AbstractButton implements ConfirmButtonInteractable {

    public ConfirmButton(ButtonStyle style) {
        super(style);
    }
}
