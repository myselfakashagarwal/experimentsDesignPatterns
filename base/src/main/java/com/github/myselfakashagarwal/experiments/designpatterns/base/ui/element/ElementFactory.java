package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.StyleFactory;

public class ElementFactory {

    public static Element createHeading(String theme) {
        return new Heading(StyleFactory.getTextStyle("heading", theme));
    }

    public static Element createParagraph(String theme) {
        return new Paragraph(StyleFactory.getTextStyle("paragraph", theme));
    }

    public static Element createInput(String type, String theme) {
        return switch (type.toLowerCase()) {
            case "date" -> new DateInput(StyleFactory.getInputStyle("date", theme));
            case "number" -> new NumberInput(StyleFactory.getInputStyle("number", theme));
            case "time" -> new TimeInput(StyleFactory.getInputStyle("time", theme));
            default -> new TextInput(StyleFactory.getInputStyle("text", theme));
        };
    }

    public static Element createButton(String action, String theme) {
        return switch (action.toLowerCase()) {
            case "add" -> new AddButton(StyleFactory.getButtonStyle("add", theme));
            case "cancel" -> new CancelButton(StyleFactory.getButtonStyle("cancel", theme));
            case "confirm" -> new ConfirmButton(StyleFactory.getButtonStyle("confirm", theme));
            case "remove" -> new RemoveButton(StyleFactory.getButtonStyle("remove", theme));
            default -> new AddButton(StyleFactory.getButtonStyle("add", theme));
        };
    }
}
