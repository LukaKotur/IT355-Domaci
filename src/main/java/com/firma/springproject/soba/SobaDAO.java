/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.soba;

import java.util.List;

/**
 *
 * @author Luka
 */
public interface SobaDAO {

    public int getCount();

    public List<Soba> getAllSobe();

    public void addOrUpdateSoba(Soba soba);
    
    public void deleteSoba(int sobaId);
    
    public Soba getSoba(int sobaId);

}
