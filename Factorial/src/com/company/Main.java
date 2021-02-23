package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int i, fact = 1;
        try {
            int number = Integer.parseInt(input.nextLine());
            if (number >= 0) {
                for (i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.print(number + "!" + " = " + fact);
            } else {
                System.out.print("Please enter a non-negative integer.");
            }
        } catch(NumberFormatException nfe) {
            System.out.print("Please enter a non-negative integer.");
        }

    }
}
