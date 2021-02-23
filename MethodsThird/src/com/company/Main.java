package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    DecimalFormat twoDecimals = new DecimalFormat("0.00");
        System.out.print("Enter gross salary: ");
        double grossSalary = readDouble(input);
        System.out.print("Enter income tax rate: ");
        double incomeTaxRate = readDouble(input);
        System.out.print("\n");
        System.out.print("The net salary is " + twoDecimals.format(calculateNetSalary(grossSalary, incomeTaxRate)));
    }

    public static double calculateNetSalary(double grossSalary,  double incomeTaxRate){
        return grossSalary - (grossSalary * (incomeTaxRate/100));
    }

    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.')); // Return with the input two recognize comma and dot.
    }
}
