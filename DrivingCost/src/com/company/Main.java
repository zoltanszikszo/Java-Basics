package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter driven kilometers: ");
        int drivenkilometers = Integer.parseInt(input.nextLine());
        System.out.print("Enter amount of fuel consumed: ");
        double fueld = realDouble(input);
        System.out.print("Enter fuel price per liter: ");
        double fuelprice = realDouble(input);
        double costperkilometer = fueld*fuelprice / drivenkilometers;
        System.out.print("The cost per kilometer is  " + twoDecimals.format(costperkilometer) + " euros.");
    }

    private static double realDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
