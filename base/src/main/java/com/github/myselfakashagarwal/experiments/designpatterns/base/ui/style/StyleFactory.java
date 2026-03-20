package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.ButtonStyle;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.retro.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.normal.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.button.minimalist.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.InputStyle;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.retro.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.normal.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.input.minimalist.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.TextStyle;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.retro.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.normal.*;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.style.text.minimalist.*;

import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
    private static final Map<String, Object> cache = new HashMap<>();

    public static ButtonStyle getButtonStyle(String action, String theme) {
        String key = "btn_" + action + "_" + theme;
        if (cache.containsKey(key)) return (ButtonStyle) cache.get(key);

        ButtonStyle style;
        switch (theme.toLowerCase()) {
            case "retro":
                style = switch (action.toLowerCase()) {
                    case "add" -> new RetroAddButtonStyle();
                    case "cancel" -> new RetroCancelButtonStyle();
                    case "confirm" -> new RetroConfirmButtonStyle();
                    case "remove" -> new RetroRemoveButtonStyle();
                    default -> new RetroAddButtonStyle();
                };
                break;
            case "minimalist":
                style = switch (action.toLowerCase()) {
                    case "add" -> new MinimalistAddButtonStyle();
                    case "cancel" -> new MinimalistCancelButtonStyle();
                    case "confirm" -> new MinimalistConfirmButtonStyle();
                    case "remove" -> new MinimalistRemoveButtonStyle();
                    default -> new MinimalistAddButtonStyle();
                };
                break;
            default:
                style = switch (action.toLowerCase()) {
                    case "add" -> new NormalAddButtonStyle();
                    case "cancel" -> new NormalCancelButtonStyle();
                    case "confirm" -> new NormalConfirmButtonStyle();
                    case "remove" -> new NormalRemoveButtonStyle();
                    default -> new NormalAddButtonStyle();
                };
                break;
        }
        cache.put(key, style);
        return style;
    }

    public static InputStyle getInputStyle(String type, String theme) {
        String key = "inp_" + type + "_" + theme;
        if (cache.containsKey(key)) return (InputStyle) cache.get(key);

        InputStyle style;
        switch (theme.toLowerCase()) {
            case "retro":
                style = switch (type.toLowerCase()) {
                    case "date" -> new RetroDateInputStyle();
                    case "number" -> new RetroNumberInputStyle();
                    case "time" -> new RetroTimeInputStyle();
                    default -> new RetroTextInputStyle();
                };
                break;
            case "minimalist":
                style = switch (type.toLowerCase()) {
                    case "date" -> new MinimalistDateInputStyle();
                    case "number" -> new MinimalistNumberInputStyle();
                    case "time" -> new MinimalistTimeInputStyle();
                    default -> new MinimalistTextInputStyle();
                };
                break;
            default:
                style = switch (type.toLowerCase()) {
                    case "date" -> new NormalDateInputStyle();
                    case "number" -> new NormalNumberInputStyle();
                    case "time" -> new NormalTimeInputStyle();
                    default -> new NormalTextInputStyle();
                };
                break;
        }
        cache.put(key, style);
        return style;
    }

    public static TextStyle getTextStyle(String type, String theme) {
        String key = "txt_" + type + "_" + theme;
        if (cache.containsKey(key)) return (TextStyle) cache.get(key);

        TextStyle style;
        switch (theme.toLowerCase()) {
            case "retro":
                style = type.toLowerCase().contains("heading") ? new RetroHeadingStyle() : new RetroParagraphStyle();
                break;
            case "minimalist":
                style = type.toLowerCase().contains("heading") ? new MinimalistHeadingStyle() : new MinimalistParagraphStyle();
                break;
            default:
                style = type.toLowerCase().contains("heading") ? new NormalHeadingStyle() : new NormalParagraphStyle();
                break;
        }
        cache.put(key, style);
        return style;
    }
}
