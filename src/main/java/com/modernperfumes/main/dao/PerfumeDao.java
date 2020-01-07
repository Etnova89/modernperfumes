package com.modernperfumes.main.dao;

import com.modernperfumes.main.model.Perfume;
import com.modernperfumes.main.model.mapper.PerfumeMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PerfumeDao {

    NamedParameterJdbcTemplate template;

    public PerfumeDao(NamedParameterJdbcTemplate template) {
        this.template = template;
    }
    public List<Perfume> selectPerfumes() {
        final String sql = "select * from perfume";
        List<Perfume> perfumes = template.query(sql, new PerfumeMapper());
        return perfumes;
    }
}
