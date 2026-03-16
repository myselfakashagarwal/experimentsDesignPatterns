package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input;

public interface NumberInputInteractable extends InputInteractable {

    default void onInput(String input) {
        System.out.println("Number input received: " + input);
    }
}
