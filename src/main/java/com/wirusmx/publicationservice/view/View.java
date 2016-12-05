package com.wirusmx.publicationservice.view;

import com.wirusmx.publicationservice.controller.Controller;

import javax.swing.*;
import java.awt.*;

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
        JPanel importPane = new JPanel(new BorderLayout());
        JList<String> list = new JList<String>();
        JScrollPane listPane = new JScrollPane(list);
        JPanel importPaneButtons = new JPanel(new GridLayout(1, 3));
        importPane.add(importPaneButtons, BorderLayout.SOUTH);
        JButton addButton = new JButton("Добавить");
        importPaneButtons.add(addButton);
        JButton editButton = new JButton("Редактировать");
        importPaneButtons.add(editButton);
        JButton deleteButton = new JButton("Удалить");
        importPaneButtons.add(deleteButton);

        tabbedPane.addTab("Импорт", importPane);
        JPanel exportPane = new JPanel();
        tabbedPane.addTab("Экспорт", exportPane);
        JPanel settingsPane = new JPanel();
        tabbedPane.addTab("Настройки", settingsPane);
        tabbedPane.setSelectedIndex(0);

        add(tabbedPane);

        setVisible(true);

    }


}
