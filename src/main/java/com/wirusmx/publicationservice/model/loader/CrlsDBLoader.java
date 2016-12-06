package com.wirusmx.publicationservice.model.loader;

import com.wirusmx.publicationservice.model.CrlEntry;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class CrlsDBLoader implements CrlsListLoader{
    private JdbcTemplate jdbcTemplate;

    public CrlsDBLoader(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(List<CrlEntry> ftps) {

    }

    public List<CrlEntry> load() {
        List<CrlEntry> crls = new ArrayList<CrlEntry>();

        return crls;
    }
}
