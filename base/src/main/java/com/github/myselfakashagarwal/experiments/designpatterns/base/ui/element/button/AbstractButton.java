package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;

public abstract class AbstractButton implements Element {
    protected String id;
    protected ButtonStyle style;

    public AbstractButton(ButtonStyle style) {
        this.id = "btn_" + System.identityHashCode(this);
        this.style = style;
    }

    // Copy constructor
    protected AbstractButton(AbstractButton other) {
        this.id = "btn_clone_" + System.identityHashCode(this);
        this.style = other.style; // Shared flyweight
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ButtonStyle getStyle() {
        return style;
    }

    public void setStyle(ButtonStyle style) {
        this.style = style;
    }

    public void render() {
        if (style != null) {
            style.apply();
        }
    }

    @Override
    public abstract Element cloneElement();
}
