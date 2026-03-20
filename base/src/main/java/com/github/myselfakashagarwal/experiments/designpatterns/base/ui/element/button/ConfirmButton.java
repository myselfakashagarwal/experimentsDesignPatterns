package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button.ConfirmButtonInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class ConfirmButton extends AbstractButton implements ConfirmButtonInteractable {

    public ConfirmButton(ButtonStyle style) {
        super(style);
    }

    protected ConfirmButton(ConfirmButton other) {
        super(other);
    }

    @Override
    public ConfirmButton cloneElement() {
        return new ConfirmButton(this);
    }
}
