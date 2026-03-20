package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button.AddButtonInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class AddButton extends AbstractButton implements AddButtonInteractable {

    public AddButton(ButtonStyle style) {
        super(style);
    }

    protected AddButton(AddButton other) {
        super(other);
    }

    @Override
    public AddButton cloneElement() {
        return new AddButton(this);
    }
}
