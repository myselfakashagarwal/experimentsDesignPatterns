package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;

public abstract class AbstractInput implements Element {
    protected String id;
    protected String placeholder;
    protected String value;
    protected InputStyle style;

    public AbstractInput(InputStyle style) {
        this.id = "inp_" + System.identityHashCode(this);
        this.style = style;
        this.value = "";
        this.placeholder = "Enter text...";
    }

    // Copy constructor
    protected AbstractInput(AbstractInput other) {
        this.id = "inp_clone_" + System.identityHashCode(this);
        this.value = other.value;
        this.placeholder = other.placeholder;
        this.style = other.style; // Shared flyweight
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
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

    @Override
    public abstract Element cloneElement();

    public void render() {
        if (style != null) {
            style.apply();
        }
    }
}
