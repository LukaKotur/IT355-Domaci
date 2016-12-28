/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.soba;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Luka
 */
public class SobaMapper implements RowMapper<Soba> {

    @Override
    public Soba mapRow(ResultSet rs, int i) throws SQLException {
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

}
