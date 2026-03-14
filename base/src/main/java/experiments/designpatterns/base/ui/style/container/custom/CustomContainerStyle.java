package experiments.designpatterns.base.ui.style.container.custom;

import experiments.designpatterns.base.ui.style.container.ContainerStyle;
import experiments.designpatterns.base.ui.style.prototype.StylePrototype;

public final class CustomContainerStyle extends ContainerStyle implements StylePrototype<CustomContainerStyle> {

    private CustomContainerStyle(Builder builder) {
        super(builder.padding, builder.margin, builder.borderColor, builder.backgroundColor, builder.display);
    }

    public CustomContainerStyle() {
        super("0px", "0px", "transparent", "transparent", "block");
    }

    @Override
    public void apply() {
        System.out.println("Applying Custom Container Style:");
        System.out.println("  Padding:          " + padding);
        System.out.println("  Margin:           " + margin);
        System.out.println("  Border Color:     " + borderColor);
        System.out.println("  Background Color: " + backgroundColor);
        System.out.println("  Display:          " + display);
    }

    @Override
    public CustomContainerStyle copy() {
        return CustomContainerStyle.builder()
                .padding(this.padding)
                .margin(this.margin)
                .borderColor(this.borderColor)
                .backgroundColor(this.backgroundColor)
                .display(this.display)
                .build();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String padding         = "0px";
        private String margin          = "0px";
        private String borderColor     = "transparent";
        private String backgroundColor = "transparent";
        private String display         = "block";

        private Builder() {}

        public Builder padding(String padding) {
            this.padding = padding;
            return this;
        }

        public Builder margin(String margin) {
            this.margin = margin;
            return this;
        }

        public Builder borderColor(String borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Builder backgroundColor(String backgroundColor) {
            this.backgroundColor = backgroundColor;
            return this;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public CustomContainerStyle build() {
            return new CustomContainerStyle(this);
        }
    }
}
