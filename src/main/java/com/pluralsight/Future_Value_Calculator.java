package com.pluralsight;

import java.util.Scanner;

public class Future_Value_Calculator {
    public static void main(String[] args) {
        Scanner future = new Scanner(System.in);
        System.out.print("Deposit amount: $");
        double deposit = future.nextDouble();
        System.out.print("Interest rate: ");
        double interest = future.nextDouble();
        System.out.print("Number of years: ");
        double userYears = future.nextDouble();

        double d = deposit;             //1000
        double i = interest / 100;      //1.75 to 0.0175
        double u = userYears;           //5 years
        double n = 365;                 //interest compounded daily
        double t = u * n;               //365 * 5 = 1825

        double cD = (d * Math.pow((1 + (i/n)), t));
        double tInterest = cD - d;

        System.out.printf("The future value of this one-time deposit is: %.2f", cD);
        System.out.printf("\nThe total interest earned is: %.2f", tInterest);
    }
}
