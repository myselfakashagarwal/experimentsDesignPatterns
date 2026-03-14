package experiments.designpatterns.base.ui.interaction.button;

public interface CancelButtonInteractable extends ButtonInteractable {

    default void onClick() {
        onCancel();
    }

    default void onHover() {
        System.out.println("Hovering over Cancel Button...");
    }

    default void onCancel() {
        System.out.println("Cancel action executed.");
    }
}
