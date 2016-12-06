package com.wirusmx.publicationservice.controller;

import com.wirusmx.publicationservice.model.CrlEntry;
import com.wirusmx.publicationservice.model.FtpEntry;
import com.wirusmx.publicationservice.model.Model;
import com.wirusmx.publicationservice.view.View;

import java.util.List;

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

    public List<CrlEntry> getCrls() {
        return model.getCrls();
    }

    public List<FtpEntry> getFtps() {
        return model.getFtps();
    }

    public void addCrl(CrlEntry entry){
        model.addCrl(entry);
    }

    public void addFtp(FtpEntry entry){
        model.addFtp(entry);
    }

    public void removeCrl(CrlEntry entry){
        model.removeCrl(entry);
    }

    public void removeFtp(FtpEntry entry){
        model.removeFtp(entry);
    }


}
