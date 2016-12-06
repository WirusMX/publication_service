package com.wirusmx.publicationservice.model;

public class FtpEntry {
    private String url;
    private String user;
    private String password;

    public FtpEntry(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return user + "@" + url;
    }
}
