package com.wirusmx.publicationservice.model.loader;

import com.wirusmx.publicationservice.model.FtpEntry;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class FtpsDBLoader implements FtpsListLoader {

    private JdbcTemplate jdbcTemplate;

    public FtpsDBLoader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(List<FtpEntry> ftps) {

    }

    public List<FtpEntry> load() {
        List<FtpEntry> ftps = new ArrayList<FtpEntry>();
        return ftps;
    }
}
