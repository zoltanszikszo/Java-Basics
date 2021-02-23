package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade (0-5): ");
        String inputValue = input.nextLine();
        boolean success = false;
        while (!success) {
            try {
                if (Integer.parseInt(inputValue) > 5 || Integer.parseInt(inputValue) < 0) {
                    System.out.println(inputValue + " is not a valid grade.");
                    System.out.print("Enter grade (0-5): ");
                    inputValue = input.nextLine();
                } else {
                    System.out.println("OK");
                    success = true;
                }
            } catch (NumberFormatException nfe) {
                System.out.println(inputValue + " is not a valid grade.");
                System.out.print("Enter grade (0-5): ");
                inputValue = input.nextLine();
            }
        }
    }
}
