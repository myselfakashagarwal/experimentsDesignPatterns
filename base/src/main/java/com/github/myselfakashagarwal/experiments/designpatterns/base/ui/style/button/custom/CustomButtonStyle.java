package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.custom;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.prototype.StylePrototype;

public final class CustomButtonStyle extends ButtonStyle implements StylePrototype<CustomButtonStyle> {

    private CustomButtonStyle(Builder builder) {
        super(builder.padding, builder.margin, builder.borderColor, builder.backgroundColor);
    }

    public CustomButtonStyle() {
        super("0px", "0px", "transparent", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Custom Button Style:");
        System.out.println("  Padding:          " + padding);
        System.out.println("  Margin:           " + margin);
        System.out.println("  Border Color:     " + borderColor);
        System.out.println("  Background Color: " + backgroundColor);
    }

    @Override
    public CustomButtonStyle copy() {
        return CustomButtonStyle.builder()
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

        public CustomButtonStyle build() {
            return new CustomButtonStyle(this);
        }
    }
}
