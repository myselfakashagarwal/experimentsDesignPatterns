package experiments.designpatterns.base.ui.element.text;

import experiments.designpatterns.base.ui.element.Element;
import experiments.designpatterns.base.ui.style.text.TextStyle;

public abstract class AbstractText implements Element {
    protected TextStyle style;

    public AbstractText(TextStyle style) {
        this.style = style;
    }

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
