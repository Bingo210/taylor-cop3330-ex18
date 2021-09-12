/*
 * UCF COP3330 Fall 2021 Assignment 18 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius." );
        System.out.println( "Press F to convert from Celsius to Fahrenheit." );
        String userChoice = input.next();
        System.out.println( "Your choice: " + userChoice );
        userChoice = userChoice.toLowerCase();

        if (userChoice.equals("c")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            float tempF = input.nextFloat();

            float tempC = (tempF - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + tempC);
        }
        else if (userChoice.equals("f")) {
            System.out.println("Please enter the temperature in Celsius: ");
            float tempC = input.nextFloat();

            float tempF = (tempC * 9 / 5) + 32;

            System.out.println("The temperature in Fahrenheit is " + tempF);
        }
        else
            System.out.println("Invalid response. Re-run program.");
    }
}