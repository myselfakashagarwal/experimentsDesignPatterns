package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public abstract class AbstractText implements Element {
    protected String id;
    protected String text;
    protected TextStyle style;

    public AbstractText(TextStyle style) {
        this.id = "txt_" + System.identityHashCode(this);
        this.style = style;
        this.text = "";
    }

    // Copy constructor
    protected AbstractText(AbstractText other) {
        this.id = "txt_clone_" + System.identityHashCode(this);
        this.text = other.text;
        this.style = other.style; // Styles are shared flyweights
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public abstract Element cloneElement();

    public TextStyle getStyle() {
        return style;
    }

    public void setStyle(TextStyle style) {
        this.style = style;
    }

    public void render() {
        if (style != null) {
            style.apply();
        }
    }
}
