package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        System.out.print("Enter initial deposit: ");
        double initialDeposit = readDouble(input);
        System.out.print("Enter interest rate: ");
        double interestRate = readDouble(input);
        System.out.print("Enter capital income tax rate: ");
        double capitalTax = readDouble(input);
        System.out.print("Enter number of years: ");
        int numberOfYears = Integer.parseInt(input.nextLine());
        System.out.print("\n");

        double helperInterest;
        double helperCapitalTax;
        double helperInterestAftTax;

        for (int i = 1; i <= numberOfYears; i++){
            helperInterest = initialDeposit * (interestRate/100);
            helperCapitalTax = helperInterest * (capitalTax/100);
            helperInterestAftTax = helperInterest - helperCapitalTax;

            initialDeposit += helperInterestAftTax;
            System.out.println(i + ": " + twoDecimals.format(initialDeposit));
        }
    }

    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.')); // Return with the input two recognize comma and dot.
    }
}
