package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input.DateInputInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public class DateInput extends AbstractInput implements DateInputInteractable {

    public DateInput(InputStyle style) {
        super(style);
    }

    protected DateInput(DateInput other) {
        super(other);
    }

    @Override
    public DateInput cloneElement() {
        return new DateInput(this);
    }
}
