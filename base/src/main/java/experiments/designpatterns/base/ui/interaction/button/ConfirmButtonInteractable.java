package experiments.designpatterns.base.ui.interaction.button;

public interface ConfirmButtonInteractable extends ButtonInteractable {

    default void onClick() {
        onConfirm();
    }

    default void onHover() {
        System.out.println("Hovering over Confirm Button...");
    }

    default void onConfirm() {
        System.out.println("Confirm action executed.");
    }
}
