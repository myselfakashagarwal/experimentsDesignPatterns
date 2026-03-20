package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.html;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button.AbstractButton;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container.AbstractContainer;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input.AbstractInput;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text.AbstractText;

import java.util.List;

public class HtmlBuilder {

    public String build(AbstractContainer container) {
        StringBuilder sb = new StringBuilder();
        sb.append("<div class=\"form-container\" style=\"padding: 20px; border: 1px solid #ccc;\">");
        
        List<Element> elements = container.getElements();
        if (elements != null) {
            for (Element e : elements) {
                sb.append(buildElement(e));
            }
        }
        
        sb.append("</div>");
        return sb.toString();
    }

    public String buildSidebar(AbstractContainer container) {
        if (container == null || container.getElements() == null || container.getElements().isEmpty()) {
            return "<div class='empty-sidebar'>Empty</div>";
        }
        
        StringBuilder sb = new StringBuilder();
        for (Element el : container.getElements()) {
            sb.append("<div class=\"element-item\">");
            sb.append("<span>").append(el.getClass().getSimpleName()).append("</span>");
            sb.append("<span style=\"font-family: monospace; font-size: 10px;\">").append(el.getId()).append("</span>");
            sb.append("</div>");
        }
        return sb.toString();
    }

    private String buildElement(Element e) {
        if (e instanceof AbstractText) {
            AbstractText t = (AbstractText) e;
            String tag = e.getClass().getSimpleName().contains("Heading") ? "h2" : "p";
            return String.format("<%s style=\"%s\">%s</%s>", tag, getStyles(t.getStyle()), t.getText(), tag);
        } else if (e instanceof AbstractInput) {
            AbstractInput i = (AbstractInput) e;
            String type = "text";
            if (e.getClass().getSimpleName().contains("Number")) type = "number";
            if (e.getClass().getSimpleName().contains("Date")) type = "date";
            return String.format("<input type=\"%s\" placeholder=\"%s\" style=\"%s\" />", type, i.getPlaceholder(), getStyles(i.getStyle()));
        } else if (e instanceof AbstractButton) {
            AbstractButton b = (AbstractButton) e;
            String text = e.getClass().getSimpleName().replace("Button", "").replace("Abstract", "").toUpperCase();
            if (text.isEmpty()) text = "BUTTON";
            return String.format("<button class=\"btn\" style=\"%s\">%s</button>", getStyles(b.getStyle()), text);
        }
        return "";
    }

    private String getStyles(Object style) {
        StringBuilder sb = new StringBuilder();
        if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle) style;
            appendStyle(sb, "padding", s.getPadding());
            appendStyle(sb, "margin", s.getMargin());
            appendStyle(sb, "border", "2px solid " + s.getBorderColor());
            appendStyle(sb, "background-color", s.getBackgroundColor());
            appendStyle(sb, "color", s.getColor());
        } else if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle) style;
            appendStyle(sb, "padding", s.getPadding());
            appendStyle(sb, "margin", s.getMargin());
            appendStyle(sb, "border", "1px solid " + s.getBorderColor());
            appendStyle(sb, "background-color", s.getBackgroundColor());
            appendStyle(sb, "color", s.getColor());
        } else if (style instanceof com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle) {
            com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle s = (com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle) style;
            appendStyle(sb, "padding", s.getPadding());
            appendStyle(sb, "margin", s.getMargin());
            appendStyle(sb, "color", s.getColor());
        }
        return sb.toString();
    }

    private void appendStyle(StringBuilder sb, String property, String value) {
        if (value != null && !value.isEmpty()) {
            sb.append(property).append(": ").append(value).append("; ");
        }
    }
}
