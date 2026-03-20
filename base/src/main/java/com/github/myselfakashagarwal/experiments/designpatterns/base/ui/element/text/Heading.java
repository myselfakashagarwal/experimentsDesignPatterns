package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.text.HeadingInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public class Heading extends AbstractText implements HeadingInteractable {

    public Heading(TextStyle style) {
        super(style);
    }

    protected Heading(Heading other) {
        super(other);
    }

    @Override
    public Heading cloneElement() {
        return new Heading(this);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering Heading...");
    }
}
