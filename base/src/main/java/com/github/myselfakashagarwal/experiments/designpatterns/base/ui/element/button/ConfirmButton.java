package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button.ConfirmButtonInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class ConfirmButton extends AbstractButton implements ConfirmButtonInteractable {

    public ConfirmButton(ButtonStyle style) {
        super(style);
    }
}
