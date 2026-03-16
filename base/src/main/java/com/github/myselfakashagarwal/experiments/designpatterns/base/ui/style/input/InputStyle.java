package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input;

public abstract class InputStyle {
    protected String padding;
    protected String margin;
    protected String borderColor;
    protected String backgroundColor;

    public InputStyle(String padding, String margin, String borderColor, String backgroundColor) {
        this.padding = padding;
        this.margin = margin;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    public abstract void apply();

    public String getPadding() { return padding; }
    public void setPadding(String padding) { this.padding = padding; }

    public String getMargin() { return margin; }
    public void setMargin(String margin) { this.margin = margin; }

    public String getBorderColor() { return borderColor; }
    public void setBorderColor(String borderColor) { this.borderColor = borderColor; }

    public String getBackgroundColor() { return backgroundColor; }
    public void setBackgroundColor(String backgroundColor) { this.backgroundColor = backgroundColor; }
}
