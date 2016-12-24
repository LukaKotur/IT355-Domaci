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
public class Soba {
    private int sobaId;
    private int numberOfBeds;
    private double size;
    private String bathroom;
    private String ac;
    private String tv;
    private double pricePerDay;

    public Soba() {
    }

    public Soba(int numberOfBeds, double size, String bathroom, String ac, String tv, double pricePerDay) {
        this.numberOfBeds = numberOfBeds;
        this.size = size;
        this.bathroom = bathroom;
        this.ac = ac;
        this.tv = tv;
        this.pricePerDay = pricePerDay;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    
}
