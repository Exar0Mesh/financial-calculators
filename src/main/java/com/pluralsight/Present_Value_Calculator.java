package com.pluralsight;

import java.util.Scanner;

public class Present_Value_Calculator {
    public static void main(String[] args) {
        Scanner future = new Scanner(System.in);
        System.out.print("Monthly payout: $");
        double mPayout = future.nextDouble();
        System.out.print("Expected interest rate: ");
        double interest = future.nextDouble();
        System.out.print("Number of years to pay out: ");
        double yearsPay = future.nextDouble();

        double P = mPayout * 12;
        double I = interest / 100;
        double Y = yearsPay;

        double A = P * ((1 - Math.pow((1+I), -Y)) / I);
        System.out.print("The Present Value of Annuity is: " + A);
    }
}
