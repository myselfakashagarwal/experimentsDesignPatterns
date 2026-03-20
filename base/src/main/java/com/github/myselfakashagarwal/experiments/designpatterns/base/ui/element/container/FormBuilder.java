package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.ElementFactory;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input.AbstractInput;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text.AbstractText;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.container.normal.NormalDivStyle;

public class FormBuilder {
    private final String theme;
    private final AbstractContainer container;

    public FormBuilder(String theme) {
        this.theme = theme;
        // Using a Div with default normal style for the form container
        this.container = new Div(new NormalDivStyle());
    }

    public FormBuilder addHeading(String text) {
        AbstractText h = (AbstractText) ElementFactory.createHeading(theme);
        h.setText(text);
        container.addElement(h);
        return this;
    }

    public FormBuilder addParagraph(String text) {
        AbstractText p = (AbstractText) ElementFactory.createParagraph(theme);
        p.setText(text);
        container.addElement(p);
        return this;
    }

    public FormBuilder addTextInput(String placeholder) {
        AbstractInput i = (AbstractInput) ElementFactory.createInput("text", theme);
        i.setPlaceholder(placeholder);
        container.addElement(i);
        return this;
    }

    public FormBuilder addNumberInput(String placeholder) {
        AbstractInput i = (AbstractInput) ElementFactory.createInput("number", theme);
        i.setPlaceholder(placeholder);
        container.addElement(i);
        return this;
    }

    public FormBuilder addButton(String action) {
        container.addElement(ElementFactory.createButton(action, theme));
        return this;
    }

    public AbstractContainer build() {
        return container;
    }
}
