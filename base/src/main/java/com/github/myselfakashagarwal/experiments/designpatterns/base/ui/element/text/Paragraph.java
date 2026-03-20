package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.text.ParagraphInteractable;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;

public class Paragraph extends AbstractText implements ParagraphInteractable {

    public Paragraph(TextStyle style) {
        super(style);
    }

    protected Paragraph(Paragraph other) {
        super(other);
    }

    @Override
    public Paragraph cloneElement() {
        return new Paragraph(this);
    }

    @Override
    public void render() {
        super.render();
        System.out.println("Rendering Paragraph...");
    }
}
