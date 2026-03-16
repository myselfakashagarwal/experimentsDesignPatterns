package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.button;

public interface AddButtonInteractable extends ButtonInteractable {

    default void onClick() {
        onAdd();
    }

    default void onHover() {
        System.out.println("Hovering over Add Button...");
    }

    default void onAdd() {
        System.out.println("Add action executed.");
    }
}
