package com.wirusmx.publicationservice;

import com.wirusmx.publicationservice.controller.Controller;
import com.wirusmx.publicationservice.model.Model;
import com.wirusmx.publicationservice.view.View;

/**
 * Application main class. Contains <code>public static void main</code> method
 * and nothing else.
 */
public class MainClass {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();

        Controller controller = new Controller(model, view);

        model.setController(controller);
        view.setController(controller);

        controller.init();
    }
}
