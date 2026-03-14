package experiments.designpatterns.base.ui.interaction.input;

public interface TextInputInteractable extends InputInteractable {

    default void onInput(String input) {
        System.out.println("Text input received: " + input);
    }
}
