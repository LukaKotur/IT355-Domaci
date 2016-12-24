/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firma.springproject.soba;

/**
 *
 * @author Luka
 */
public class SobaImplements implements SobaInterface{
    private Soba soba;

    @Override
    public void addSoba() {
        System.out.println("Dodata je soba!");
    }
    
    @Override
    public void throwException() throws Exception {
        System.out.println("Izbacujem gresku!");
        throw new Exception("Genericka Greska!");
    }
    
}
