package com.wirusmx.publicationservice.model.loader;

import com.wirusmx.publicationservice.model.CrlEntry;

import java.util.List;

public interface CrlsListLoader {
    void save(List<CrlEntry> ftps);
    List<CrlEntry> load();
}
