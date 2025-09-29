/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10458285_prog6112_test;

/**
 *
 * @author lab_services_student
 */
public class CricketRunsScored extends Cricket {

    public CricketRunsScored(String batsmen, String stadium, int runsScored) {
        super(batsmen, stadium, runsScored);
    }

    public void printReport() {
        System.out.println("BATSMEN RUNS SCORED REPORT");
        System.out.println("-*******************************");
        System.out.println("CRICKET PLAYER:   " + getBatsmen());
        System.out.println("STADIUM:           " + getStadium());
        System.out.println("TOTAL RUNS: " + getRunsScored());
    }
}
