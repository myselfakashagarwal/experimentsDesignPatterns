package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input.NumberInputInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class NumberInput extends AbstractInput implements NumberInputInteractable {

    public NumberInput(InputStyle style) {
        super(style);
    }

    protected NumberInput(NumberInput other) {
        super(other);
    }

    @Override
    public NumberInput cloneElement() {
        return new NumberInput(this);
    }
}
