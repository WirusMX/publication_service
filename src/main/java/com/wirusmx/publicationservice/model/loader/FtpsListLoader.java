package com.wirusmx.publicationservice.model.loader;

import com.wirusmx.publicationservice.model.FtpEntry;

import java.util.List;

public interface FtpsListLoader {
    void save(List<FtpEntry> ftps);
    List<FtpEntry> load();
}
