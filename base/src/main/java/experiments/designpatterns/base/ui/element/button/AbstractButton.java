package experiments.designpatterns.base.ui.element.button;

import experiments.designpatterns.base.ui.element.Element;
import experiments.designpatterns.base.ui.style.button.ButtonStyle;

public abstract class AbstractButton implements Element {
    protected ButtonStyle style;

    public AbstractButton(ButtonStyle style) {
        this.style = style;
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
}
