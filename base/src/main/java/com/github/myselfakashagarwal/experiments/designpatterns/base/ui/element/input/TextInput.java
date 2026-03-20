package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input.TextInputInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class TextInput extends AbstractInput implements TextInputInteractable {

    public TextInput(InputStyle style) {
        super(style);
    }

    protected TextInput(TextInput other) {
        super(other);
    }

    @Override
    public TextInput cloneElement() {
        return new TextInput(this);
    }
}
