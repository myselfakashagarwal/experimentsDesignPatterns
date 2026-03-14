package experiments.designpatterns.base.ui.element.button;

import experiments.designpatterns.base.ui.interaction.button.RemoveButtonInteractable;
import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RemoveButton extends AbstractButton implements RemoveButtonInteractable {

    public RemoveButton(ButtonStyle style) {
        super(style);
    }
}
