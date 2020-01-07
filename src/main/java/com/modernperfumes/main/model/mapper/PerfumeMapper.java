package com.modernperfumes.main.model.mapper;

import com.modernperfumes.main.model.Perfume;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PerfumeMapper implements RowMapper<Perfume> {
    public Perfume mapRow(ResultSet rs, int arg1) throws SQLException {
        Perfume perfume = new Perfume();
        perfume.setName(rs.getString("name"));
        return perfume;
    }
}
