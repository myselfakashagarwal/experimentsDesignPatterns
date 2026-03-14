package experiments.designpatterns.base.ui.element.container;

import experiments.designpatterns.base.ui.element.Element;
import experiments.designpatterns.base.ui.style.container.ContainerStyle;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContainer implements Element {
    protected ContainerStyle style;
    protected List<Element> elements;

    public AbstractContainer(ContainerStyle style) {
        this.style = style;
        this.elements = new ArrayList<>();
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
}
