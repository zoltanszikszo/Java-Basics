package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter driven kilometers: ");
        int drivenKilometers = Integer.parseInt(input.nextLine());
        System.out.print("Enter fuel consumption per 100 km: ");
        double fuelConsumption = realDouble(input);
        System.out.print("Enter fuel price per liter: ");
        double fuelPrice = realDouble(input);
        System.out.print("Enter number of people: ");
        int numPeople = Integer.parseInt(input.nextLine());
        double costPerPeople = (fuelConsumption * fuelPrice) * drivenKilometers / numPeople / 100;
        System.out.print("Each of the " + numPeople + " people should pay " + twoDecimals.format(costPerPeople) + " euros.");
    }

    private static double realDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}