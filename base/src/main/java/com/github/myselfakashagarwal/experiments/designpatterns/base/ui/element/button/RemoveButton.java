package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button.RemoveButtonInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class RemoveButton extends AbstractButton implements RemoveButtonInteractable {

    public RemoveButton(ButtonStyle style) {
        super(style);
    }

    protected RemoveButton(RemoveButton other) {
        super(other);
    }

    @Override
    public RemoveButton cloneElement() {
        return new RemoveButton(this);
    }
}
