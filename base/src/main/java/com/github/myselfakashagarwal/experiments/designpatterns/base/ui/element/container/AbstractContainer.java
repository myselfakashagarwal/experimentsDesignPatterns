package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.container.ContainerStyle;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContainer implements Element {
    protected String id;
    protected ContainerStyle style;
    protected List<Element> elements;

    public AbstractContainer(ContainerStyle style) {
        this.id = "cont_" + System.identityHashCode(this);
        this.style = style;
        this.elements = new ArrayList<>();
    }

    // Copy constructor
    protected AbstractContainer(AbstractContainer other) {
        this.id = "cont_clone_" + System.identityHashCode(this);
        this.style = other.style; // Shared flyweight
        this.elements = new ArrayList<>();
        if (other.elements != null) {
            for (Element e : other.elements) {
                this.elements.add(e.cloneElement());
            }
        }
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ContainerStyle getStyle() {
        return style;
    }

    public void setStyle(ContainerStyle style) {
        this.style = style;
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void removeElement(Element element) {
        this.elements.remove(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    public void render() {
        if (style != null) {
            style.apply();
        }
        for (Element element : elements) {

            System.out.println("Rendering child element: " + element.getClass().getSimpleName());
        }
    }

    @Override
    public abstract Element cloneElement();
}
