package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App
{
    private static double rate=0.055; //make the rate a constant
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int [] price = new int[3];
        int [] quantity = new int[3];
        double subtotal = 0, total = 0, tax = 0; //set it all to 0 just in case
        NumberFormat dollar = NumberFormat.getCurrencyInstance(); //convert to dollar format

        for (int i = 0; i < 3; i++) { //save space with a for loop
            System.out.print("Enter the price of item " +(i+1) +" : ");
            price[i] = scan.nextInt();
            System.out.print("Enter the quantity of item " +(i+1) +" : ");
            quantity[i] = scan.nextInt();
        }

        //calculate the subtotal by adding all the array contents
        for (int i = 0; i < 3; i++) {
            subtotal = subtotal + (price[i] * quantity[i]);
        }
        tax = subtotal * rate;
        total = subtotal + tax;
        System.out.print("Subtotal: "  +dollar.format(subtotal) +"\nTax: " +dollar.format(tax) +"\nTotal: " +dollar.format(total));
    }
}
