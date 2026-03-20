package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.container.ContainerStyle;

public class Div extends AbstractContainer {

    public Div(ContainerStyle style) {
        super(style);
    }

    protected Div(Div other) {
        super(other);
    }

    @Override
    public Div cloneElement() {
        return new Div(this);
    }
}
