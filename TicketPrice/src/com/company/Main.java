package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter price for a single ticket: ");
        double singleticket = realDouble(input);
        System.out.print("Enter price for a season ticket: ");
        double seasonticket = realDouble(input);
        System.out.print("Enter the number of bus trips per month: ");
        double bustrips = realDouble(input);

        double tripsvalue = singleticket*bustrips;

        if(tripsvalue == seasonticket){
            System.out.println("There is no difference in the price.");
        } else if (tripsvalue > seasonticket) {
            System.out.println("Buying a season ticket is " + twoDecimals.format(tripsvalue-seasonticket) + " euros cheaper.");
        } else{
            System.out.println("Buying single tickets is " + twoDecimals.format(seasonticket-tripsvalue) + " euros cheaper.");
        }
    }

    private static double realDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}