package experiments.designpatterns.base.ui.element.button;

import experiments.designpatterns.base.ui.interaction.button.CancelButtonInteractable;
import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class CancelButton extends AbstractButton implements CancelButtonInteractable {

    public CancelButton(ButtonStyle style) {
        super(style);
    }
}
