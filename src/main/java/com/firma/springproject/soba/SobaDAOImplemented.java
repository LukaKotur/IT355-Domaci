/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.soba;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

/**
 *
 * @author Luka
 */
public class SobaDAOImplemented implements SobaDAO {

    private JdbcTemplate jdbcTemplate;
    @SuppressWarnings("unused")
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int getCount() {
        String sql = "SELECT COUNT(*) FROM SOBE";
        int count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public List<Soba> getAllSobe() {
        String sql = "SELECT * FROM SOBE";
        List<Soba> sobe = jdbcTemplate.query(sql, new SobaMapper());
        return sobe;
    }

    @Override
    public void addOrUpdateSoba(Soba soba) {
        if (soba.getSobaId() > 0) {
            String sql = "UPDATE SOBE SET number_of_beds=?, ac=?, tv=?, bathroom=?, size=?, price=? WHERE id=?";
            jdbcTemplate.update(sql, soba.getNumberOfBeds(), soba.getAc(), soba.getTv(), soba.getBathroom(), soba.getSize(), soba.getPricePerDay(), soba.getSobaId());
        } else {
            String sql = "INSERT INTO SOBE "
                    + "(number_of_beds, ac, tv, bathroom, size, price) VALUES (?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, soba.getNumberOfBeds(), soba.getAc(), soba.getTv(), soba.getBathroom(), soba.getSize(), soba.getPricePerDay());
        }
    }

    @Override
    public void deleteSoba(int sobaId) {
        String sql = "DELETE FROM sobe WHERE id=?";
        jdbcTemplate.update(sql, sobaId);
    }

    @Override
    public Soba getSoba(int sobaId) {
        String sql = "SELECT * FROM sobe WHERE id=" + sobaId;
        return jdbcTemplate.query(sql, new ResultSetExtractor<Soba>() {
            @Override
            public Soba extractData(ResultSet rs) throws SQLException,
                    DataAccessException {
                if (rs.next()) {
                    Soba soba = new Soba();
                    soba.setSobaId(rs.getInt("id"));
                    soba.setNumberOfBeds(rs.getInt("number_of_beds"));
                    soba.setAc(rs.getString("ac"));
                    soba.setTv(rs.getString("tv"));
                    soba.setBathroom(rs.getString("bathroom"));
                    soba.setSize(rs.getDouble("size"));
                    soba.setPricePerDay(rs.getDouble("price"));
                    return soba;
                }
                return null;
            }

        });

    }

}
