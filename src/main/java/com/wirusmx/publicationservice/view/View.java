package com.wirusmx.publicationservice.view;

import com.wirusmx.publicationservice.controller.Controller;

import javax.swing.*;

public class View extends JFrame {
    private Controller controller;

    public View() {
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        setTitle("Publication Service 1.0");
        setSize(800, 600);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Импорт", new JPanel());
        tabbedPane.addTab("Экспорт", new JPanel());
        tabbedPane.addTab("Настройки", new JPanel());
        tabbedPane.setSelectedIndex(0);

        add(tabbedPane);

        setVisible(true);

    }


}
