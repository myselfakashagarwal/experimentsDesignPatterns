package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public abstract class AbstractInput implements Element {
    protected InputStyle style;
    protected String value;

    public AbstractInput(InputStyle style) {
        this.style = style;
        this.value = "";
    }

    public InputStyle getStyle() {
        return style;
    }

    public void setStyle(InputStyle style) {
        this.style = style;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void render() {
        if (style != null) {
            style.apply();
        }
    }
}
