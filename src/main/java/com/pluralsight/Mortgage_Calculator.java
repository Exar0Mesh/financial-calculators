package com.pluralsight;

import java.util.Scanner;

public class Mortgage_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Principal: $");
        double loanAmount = in.nextDouble();
        System.out.print("interest rate: ");
        double annualRate = in.nextDouble();
        System.out.print("loan length in years: ");
        double termInYears = in.nextDouble();

        double P = loanAmount;

        double r = annualRate / 1200; // divided by 100 to get out of percentage, then divided by 12 for monthly
        double n = termInYears * 12;
        double tn = termInYears;
        double ar = annualRate / 100;

        double M = P * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
        double T = M * n;
        double I = T - P;

        System.out.print("The monthly payment is: " + M);
        System.out.print("\nThe total cost of loan is: " + T);
        System.out.print("\nThe total interest paid is: " + I);

    }
}

        /*
        A calculator used to calculate out how much a monthly payment for a loan would be
        (minus any insurance or taxes), as well as how much interest you would pay over the
        life of a loan.
        a. It would accept the principal, interest rate, and loan length from the user
        b. It would display the expected monthly payment and total interest paid

        Example: A $53,000 loan at 7.625% interest for 15 years would have a $495.09/mo payment with an interest
        of $36,115.99
        This calculator would use a compounded interest formula.

        Mortgage: an agreement between you and a lender that gives the lender the right to take your
        property if you don't repay the money you've borrowed plus interest.
        A mortgage is being given the money to buy a house that you would have to repay monthly, plus interest, over a
        span of multiple years or until it is re-payed.
         */

