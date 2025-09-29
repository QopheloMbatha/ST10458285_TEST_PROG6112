/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10458285_prog6112_test;

/**
 *
 * @author lab_services_student
 */
public abstract class Cricket implements iCricket {

    private String batsmen;
    private String stadium;
    private int runsScored;

    public Cricket(String batsmen, String stadium, int runsScored) {
        this.batsmen = batsmen;
        this.stadium = stadium;
        this.runsScored = runsScored;
    }

    @Override
    public String getBatsmen() {
        return batsmen;
    }

    @Override
    public String getStadium() {
        return stadium;
    }

    @Override
    public int getRunsScored() {
        return runsScored;
    }

}
