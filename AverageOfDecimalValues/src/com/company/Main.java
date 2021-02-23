package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        double sum = 0;
        System.out.print("Enter first number (zero ends): ");
        double number = realDouble(input);

        int counter = 1;
        if (number == 0) {
            System.out.print("Nothing to calculate");
        } else {
            sum += number;
        }
        while (number != 0) {
            System.out.print("Enter next number (zero ends): ");
            number = realDouble(input);
            if (number != 0) {
                sum += number;
                counter++;
            }
        }
        if (counter > 1) {
            System.out.println("The average is " + twoDecimals.format(sum / counter));
        }
    }

    private static double realDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}