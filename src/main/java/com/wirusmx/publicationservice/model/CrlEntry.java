package com.wirusmx.publicationservice.model;

public class CrlEntry {
    private String title;
    private String url;

    public CrlEntry(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public String toString() {
        return title;
    }
}
