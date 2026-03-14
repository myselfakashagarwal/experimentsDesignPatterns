package experiments.designpatterns.base.ui.style.text.custom;

import experiments.designpatterns.base.ui.style.text.TextStyle;
import experiments.designpatterns.base.ui.style.prototype.StylePrototype;

public final class CustomTextStyle extends TextStyle implements StylePrototype<CustomTextStyle> {

    private CustomTextStyle(Builder builder) {
        super(builder.padding, builder.margin, builder.borderColor, builder.backgroundColor);
    }

    public CustomTextStyle() {
        super("0px", "0px", "transparent", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Custom Text Style:");
        System.out.println("  Padding:          " + padding);
        System.out.println("  Margin:           " + margin);
        System.out.println("  Border Color:     " + borderColor);
        System.out.println("  Background Color: " + backgroundColor);
    }

    @Override
    public CustomTextStyle copy() {
        return CustomTextStyle.builder()
                .padding(this.padding)
                .margin(this.margin)
                .borderColor(this.borderColor)
                .backgroundColor(this.backgroundColor)
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

        public CustomTextStyle build() {
            return new CustomTextStyle(this);
        }
    }
}
