package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter selling price: ");
        double sellingprice = realDouble(input);
        if(sellingprice <= 69799){
            System.out.println();
            System.out.print("The commission is 2400,00 euros.");
        }
        else{
            double commission = sellingprice*(3.44/100);
            System.out.println();
            System.out.print("The commission is " + twoDecimals.format(commission) + " euros.");
        }
    }

    private static double realDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
