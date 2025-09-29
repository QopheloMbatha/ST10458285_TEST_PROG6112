/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10458285_prog6112_test;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class RunApplication {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("The cricket players name:");
        String player = inputDevice.next();
        inputDevice.nextLine();

        System.out.println("Enter the stadium:");
        String stadium = inputDevice.next();
        inputDevice.nextLine();

        System.out.println("Enter the total runs scored by:" + player);
        int runsScored = inputDevice.nextInt();
        inputDevice.nextLine();

        CricketRunsScored cricket = new CricketRunsScored(player, stadium, runsScored);
        cricket.printReport();;
    }

}
