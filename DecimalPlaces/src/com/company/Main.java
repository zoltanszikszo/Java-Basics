package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in); // Scanner in
        DecimalFormat twoDecimals = new DecimalFormat("0.00"); // Format declaration

        System.out.print("Enter a decimal number: "); // Input from user
        double decimalnum = readDouble(input); // Save the value to a double variable

        System.out.println(); // Skip one line
        System.out.print(twoDecimals.format((decimalnum))); // Print out the value with the format declaration
    }

    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.')); // Return with the input two recognize comma and dot.
    }
}
