package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter dividend: ");
        int dividendNum = Integer.parseInt(input.nextLine());
        System.out.print("Enter divisor: ");
        int divisorNum = Integer.parseInt(input.nextLine());

        System.out.print(dividendNum + " / " + divisorNum + " = " + dividendNum/divisorNum + ", the remainder is " + dividendNum%divisorNum);
    }

    private static double realDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
