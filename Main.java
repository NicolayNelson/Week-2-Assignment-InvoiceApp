package edu.whccd.nnelson;

import java.util.Scanner;

/*
    The purpose of this application is to replicate the code in Figure 2-17.
    author:Nicolay Nelson
 */

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println(); //print a blank line

        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the invoice subtotal from the user
            System.out.print("Enter Subtotal:   ");
            double subtotal = sc.nextDouble();

            //get the discount percent
            double discountPercent;
            if (subtotal >= 200) {
                discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }

            //calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;

            //display the results
            String message = "Discount percent: " + discountPercent + "\n"
                    + "Discount amount: " + discountAmount + "\n"
                    + "Invoice total: " + total + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}


