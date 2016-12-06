package com.wirusmx.publicationservice.model;

import com.wirusmx.publicationservice.controller.Controller;
import com.wirusmx.publicationservice.model.loader.CrlsListLoader;
import com.wirusmx.publicationservice.model.loader.FtpsListLoader;

import java.util.List;

public class Model {
    private Controller controller;
    private List<CrlEntry> crls;
    private List<FtpEntry> ftps;

    private CrlsListLoader crlsListLoader;
    private FtpsListLoader ftpsListLoader;

    public Model(CrlsListLoader crlsListLoader, FtpsListLoader ftpsListLoader) {
        this.crlsListLoader = crlsListLoader;
        this.ftpsListLoader = ftpsListLoader;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void init() {
        crls = crlsListLoader.load();
        ftps = ftpsListLoader.load();
    }

    public List<CrlEntry> getCrls() {
        return crls;
    }

    public List<FtpEntry> getFtps() {
        return ftps;
    }

    public void addCrl(CrlEntry entry){
        crls.add(entry);
        crlsListLoader.save(crls);
    }

    public void addFtp(FtpEntry entry){
        ftps.add(entry);
        ftpsListLoader.save(ftps);
    }

    public void removeCrl(CrlEntry entry){
        crls.remove(entry);
        crlsListLoader.save(crls);
    }

    public void removeFtp(FtpEntry entry){
        ftps.remove(entry);
        ftpsListLoader.save(ftps);
    }
}
