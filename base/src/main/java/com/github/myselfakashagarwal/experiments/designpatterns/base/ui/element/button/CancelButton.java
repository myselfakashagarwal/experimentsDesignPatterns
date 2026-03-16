package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button.CancelButtonInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public class CancelButton extends AbstractButton implements CancelButtonInteractable {

    public CancelButton(ButtonStyle style) {
        super(style);
    }
}
