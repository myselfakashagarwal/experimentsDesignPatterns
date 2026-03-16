package com.github.myselfakashagarwal.experiments.designpatterns.base.ui.interaction.input;

public interface DateInputInteractable extends InputInteractable {

    default void onInput(String input) {
        System.out.println("Date input received: " + input);
    }
}
