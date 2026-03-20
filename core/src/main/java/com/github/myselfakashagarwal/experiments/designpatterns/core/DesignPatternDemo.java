package com.github.myselfakashagarwal.experiments.designpatterns.core;

import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.Element;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.ElementFactory;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container.AbstractContainer;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.container.FormBuilder;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.button.AbstractButton;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.input.AbstractInput;
import com.github.myselfakashagarwal.experiments.designpatterns.base.ui.element.text.AbstractText;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DesignPatternDemo implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n--- Design Pattern Demonstration: UI System ---");

        // 1. FLYWEIGHT PATTERN: Styles are shared.
        System.out.println("\n[FLYWEIGHT PATTERN]");
        Element b1 = ElementFactory.createButton("add", "retro");
        Element b2 = ElementFactory.createButton("add", "retro");
        
        System.out.println("Button 1 style: " + b1.cloneElement().getClass().getSimpleName()); // Dummy call just to check
        // Check if styles are the same object
        Object style1 = ((AbstractButton)b1).getStyle();
        Object style2 = ((AbstractButton)b2).getStyle();
        System.out.println("Are Button 1 and Button 2 sharing the same 'retro_add' style? " + (style1 == style2));

        // 2. FACTORY PATTERN: Used via ElementFactory.
        System.out.println("\n[FACTORY PATTERN]");
        Element heading = ElementFactory.createHeading("minimalist");
        System.out.println("Created element using Factory: " + heading.getClass().getSimpleName());

        // 3. BUILDER PATTERN: Easing complex form creation.
        System.out.println("\n[BUILDER PATTERN]");
        FormBuilder builder = new FormBuilder("normal");
        AbstractContainer contactForm = builder
                .addHeading("Contact Us")
                .addParagraph("Please fill out the form below.")
                .addTextInput("Full Name")
                .addNumberInput("Phone Number")
                .addButton("confirm")
                .addButton("cancel")
                .build();
        
        System.out.println("Built a form with " + contactForm.getElements().size() + " elements.");
        contactForm.render();

        // 4. PROTOTYPE PATTERN: Cloning existing components.
        System.out.println("\n[PROTOTYPE PATTERN]");
        AbstractContainer clonedForm = (AbstractContainer) contactForm.cloneElement();
        System.out.println("Cloned the contact form.");
        
        // Update something in the clone to show it's a deep copy (of children)
        if (!clonedForm.getElements().isEmpty() && clonedForm.getElements().get(0) instanceof AbstractText) {
            ((AbstractText)clonedForm.getElements().get(0)).setText("CLONED Contact Us");
        }
        
        System.out.println("Original Form's first element text: " + ((AbstractText)contactForm.getElements().get(0)).getText());
        System.out.println("Cloned Form's first element text: " + ((AbstractText)clonedForm.getElements().get(0)).getText());

        System.out.println("\n--- End of Demonstration ---\n");
    }
}
