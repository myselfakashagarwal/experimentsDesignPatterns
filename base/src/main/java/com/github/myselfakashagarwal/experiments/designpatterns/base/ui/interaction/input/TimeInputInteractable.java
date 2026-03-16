package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input;

public interface TimeInputInteractable extends InputInteractable {

    default void onInput(String input) {
        System.out.println("Time input received: " + input);
    }
}
