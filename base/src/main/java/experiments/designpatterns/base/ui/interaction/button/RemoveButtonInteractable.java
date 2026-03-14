package experiments.designpatterns.base.ui.interaction.button;

public interface RemoveButtonInteractable extends ButtonInteractable {

    default void onClick() {
        onRemove();
    }

    default void onHover() {
        System.out.println("Hovering over Remove Button...");
    }

    default void onRemove() {
        System.out.println("Remove action executed.");
    }
}
