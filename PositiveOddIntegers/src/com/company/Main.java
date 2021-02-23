package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive odd integer: ");
        String inputValue = input.nextLine();
        while (true) {
            try {
                int integerValue = Integer.parseInt(inputValue);
                if (integerValue % 2 == 1) {
                    System.out.println("  OK");
                    System.out.println("");
                    System.out.print("Enter a positive odd integer: ");
                    inputValue = input.nextLine();
                } else {
                    System.out.println("  " + inputValue + " is not a positive odd integer\n");
                    System.out.print("Enter a positive odd integer: ");
                    inputValue = input.nextLine();
                }
            } catch (NumberFormatException nfe) {
                if (inputValue.equals("quit")) {
                    System.out.println("  Bye!");
                    input.close();
                    break;
                } else {
                    System.out.println(" '" + inputValue +"'" + " is not a positive odd integer\n");
                    System.out.print("Enter a positive odd integer: ");
                    inputValue = input.nextLine();}
            }
        }
    }
}