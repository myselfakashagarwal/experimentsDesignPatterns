package experiments.designpatterns.base.ui.element.button;

import experiments.designpatterns.base.ui.interaction.button.AddButtonInteractable;
import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class AddButton extends AbstractButton implements AddButtonInteractable {

    public AddButton(ButtonStyle style) {
        super(style);
    }
}
