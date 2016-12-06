package com.wirusmx.publicationservice;

import com.wirusmx.publicationservice.controller.Controller;
import com.wirusmx.publicationservice.model.Model;
import com.wirusmx.publicationservice.view.View;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


/**
 * Application main class. Contains <code>public static void main</code> method
 * and nothing else.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("spring_settings.xml");

        Model model = (Model) context.getBean("model");

        View view = (View) context.getBean("view");

        Controller controller = (Controller) context.getBean("controller");

        model.setController(controller);
        view.setController(controller);

        controller.init();

    }
}
