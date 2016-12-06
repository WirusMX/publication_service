package com.wirusmx.publicationservice.view;

import com.wirusmx.publicationservice.controller.Controller;
import com.wirusmx.publicationservice.model.CrlEntry;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Controller controller;

    private DefaultListModel<CrlEntry> exportListModel = new DefaultListModel<CrlEntry>();
    private DefaultListModel<CrlEntry> importListModel = new DefaultListModel<CrlEntry>();

    public View() {

    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        initImportPane(tabbedPane);

        initExportPane(tabbedPane);
        initSettingsPane(tabbedPane);
        tabbedPane.setSelectedIndex(0);

        add(tabbedPane);

        setVisible(true);
    }

    private void initImportPane(JTabbedPane tabbedPane) {
        JPanel importPane = new JPanel(new BorderLayout());
        importListModel.addElement(new CrlEntry("Test", ""));
        JList<CrlEntry> list = new JList<CrlEntry>(importListModel);
        JScrollPane listPane = new JScrollPane(list);
        importPane.add(listPane, BorderLayout.CENTER);

        JPanel importPaneButtons = new JPanel(new GridLayout(1, 5));
        JButton addButton = new JButton("Добавить");
        importPaneButtons.add(addButton);
        JButton editButton = new JButton("Редактировать");
        importPaneButtons.add(editButton);
        JButton deleteButton = new JButton("Удалить");
        importPaneButtons.add(deleteButton);
        JButton askButton = new JButton("Опросить");
        importPaneButtons.add(askButton);
        JButton askAllButton = new JButton("Опросить все");
        importPaneButtons.add(askAllButton);
        importPane.add(importPaneButtons, BorderLayout.SOUTH);

        tabbedPane.addTab("Импорт", importPane);
    }

    private void initExportPane(JTabbedPane tabbedPane) {
        JPanel exportPane = new JPanel(new BorderLayout());
        exportListModel.addElement(new CrlEntry("Test", ""));
        JList<CrlEntry> list = new JList<CrlEntry>(exportListModel);
        JScrollPane listPane = new JScrollPane(list);
        exportPane.add(listPane, BorderLayout.CENTER);

        JPanel exportPaneButtons = new JPanel(new GridLayout(1, 5));
        JButton addButton = new JButton("Добавить");
        exportPaneButtons.add(addButton);
        JButton editButton = new JButton("Редактировать");
        exportPaneButtons.add(editButton);
        JButton deleteButton = new JButton("Удалить");
        exportPaneButtons.add(deleteButton);
        exportPane.add(exportPaneButtons, BorderLayout.SOUTH);

        tabbedPane.addTab("Экспорт", exportPane);
    }

    private void initSettingsPane(JTabbedPane tabbedPane) {
        JPanel settingsPane = new JPanel(new BorderLayout(20, 20));
        JPanel panel = new JPanel(new GridLayout(3, 1));
        settingsPane.add(panel, BorderLayout.NORTH);

        JLabel label1 = new JLabel("Папки обмена:");
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        panel.add(label1);

        JPanel panel2 = new JPanel(new BorderLayout(10, 10));
        JLabel label2 = new JLabel("Папка экспорта: ");
        JTextField textField2 = new JTextField();
        JButton jButton2 = new JButton("Обзор");
        panel2.add(label2, BorderLayout.WEST);
        panel2.add(textField2, BorderLayout.CENTER);
        panel2.add(jButton2, BorderLayout.EAST);
        panel.add(panel2);

        JPanel panel3 = new JPanel(new BorderLayout(10, 10));
        JLabel label3 = new JLabel("Папка импорта: ");
        JTextField textField3 = new JTextField();
        JButton jButton3 = new JButton("Обзор");
        panel3.add(label3, BorderLayout.WEST);
        panel3.add(textField3, BorderLayout.CENTER);
        panel3.add(jButton3, BorderLayout.EAST);
        panel.add(panel3);

        tabbedPane.addTab("Настройки", settingsPane);
    }


}
