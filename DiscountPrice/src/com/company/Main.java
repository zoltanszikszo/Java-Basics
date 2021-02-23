package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00"); // Format declaration

        System.out.print("Enter original price: ");
        double oprice = readDouble(input);

        System.out.print("Enter discount percentage: ");
        double percentage = readDouble(input);

        double finalprice = oprice - (oprice*(percentage/100));

        System.out.println(); // Skip one line
        System.out.print("The final price is " + twoDecimals.format((finalprice))); // Print out the value with the format declaration
    }

    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.')); // Return with the input two recognize comma and dot.
    }
}
