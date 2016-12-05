package com.wirusmx.publicationservice.controller;

import com.wirusmx.publicationservice.model.Model;
import com.wirusmx.publicationservice.view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void init() {
        model.init();
        view.init();
    }


}
