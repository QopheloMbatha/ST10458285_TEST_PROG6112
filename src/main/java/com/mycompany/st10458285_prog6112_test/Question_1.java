/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.st10458285_prog6112_test;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Question_1 {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

//Creating 2-D arrays of the Stadiums and Batsmen using the given information.
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villers"};

//Score arrays where their length is determined by the 2-D arrays above.
        int[] scoreKings = new int[batsmen.length];
        int[] scoreSt = new int[batsmen.length];
        int[] scoreWand = new int[batsmen.length];

        System.out.println("--------------------------------------------------------------");
        System.out.println("SA CRICKET APPLICATION ");
        System.out.println("--------------------------------------------------------------");

//For loop allows the values given by the user using a scanner, to be captured and stored into the Score arrays.
//Code atrribution
//for loops taken from Java Programming 9th Edition
//Joyce Farrel

        for (int i = 0; i < stadiums.length; i++) {
            System.out.print("Enter the number runs scored by " + batsmen[i] + " at " + stadiums[0] + ": ");
            scoreKings[i] = inputDevice.nextInt();
            inputDevice.nextLine();

            System.out.print("Enter the number runs scored by " + batsmen[i] + " at " + stadiums[1] + ": ");
            scoreSt[i] = inputDevice.nextInt();
            inputDevice.nextLine();

            System.out.print("Enter the number runs scored by " + batsmen[i] + " at " + stadiums[2] + ": ");
            scoreWand[i] = inputDevice.nextInt();
            inputDevice.nextLine();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("RUNS SCORED REPORT ");
        System.out.println("--------------------------------------------------------------");

//Printing out the stored information using the Stadiums, Batsmen and Score arrays.
        System.out.println(batsmen[0] + " runs scored at " + stadiums[0] + ": " + scoreKings[0]);
        System.out.println(batsmen[0] + " runs scored at " + stadiums[1] + ": " + scoreSt[0]);
        System.out.println(batsmen[0] + " runs scored at " + stadiums[2] + ": " + scoreWand[0]);
        System.out.println("");

        System.out.println(batsmen[1] + " runs scored at " + stadiums[0] + ": " + scoreKings[1]);
        System.out.println(batsmen[1] + " runs scored at " + stadiums[1] + ": " + scoreSt[1]);
        System.out.println(batsmen[1] + " runs scored at " + stadiums[2] + ": " + scoreWand[1]);
        System.out.println("");

        System.out.println(batsmen[2] + " runs scored at " + stadiums[0] + ": " + scoreKings[2]);
        System.out.println(batsmen[2] + " runs scored at " + stadiums[1] + ": " + scoreSt[2]);
        System.out.println(batsmen[2] + " runs scored at " + stadiums[2] + ": " + scoreWand[2]);
        System.out.println("");

        System.out.println("--------------------------------------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS ");
        System.out.println("--------------------------------------------------------------");

//Score in each stadium are totalled up.
        int totalKings = 0;
        int totalSt = 0;
        int totalWand = 0;

        totalKings += scoreKings[0];
        totalKings += scoreSt[1];
        totalKings += scoreWand[2];

        System.out.println(stadiums[0] + "         " + totalKings);
        System.out.println(stadiums[1] + "         " + totalSt);
        System.out.println(stadiums[2] + "         " + totalWand);

//If statement allows the values to be compared to see the stadium with the highest runs.
        if (totalKings > totalSt && totalKings > totalWand) {
            System.out.println("STADIUM WITH THE MOST RUNS: " + stadiums[0]);
            System.out.println("--------------------------------------------------------------");
        } else if (totalSt > totalKings && totalSt > totalKings) {
            System.out.println("STADIUM WITH THE MOST RUNS: " + stadiums[1]);
            System.out.println("--------------------------------------------------------------");
        } else {
            System.out.println("STADIUM WITH THE MOST RUNS: " + stadiums[2]);
            System.out.println("--------------------------------------------------------------");
        }

    }
}
