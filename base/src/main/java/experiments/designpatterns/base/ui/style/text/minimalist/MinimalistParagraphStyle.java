package experiments.designpatterns.base.ui.style.text.minimalist;

import experiments.designpatterns.base.ui.style.text.TextStyle;

public class MinimalistParagraphStyle extends TextStyle {
    public MinimalistParagraphStyle() {
        super("0px", "4px 0px", "#333333", "transparent");
    }

    @Override
    public void apply() {
        System.out.println("Applying Minimalist Paragraph Style | Padding: " + padding + " | Margin: " + margin + " | Border: " + borderColor + " | BG: " + backgroundColor);
    }
}
