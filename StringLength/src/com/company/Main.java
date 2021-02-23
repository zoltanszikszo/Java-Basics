package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstText = input.nextLine();
        int stringLength = 0;
        while (!firstText.matches("quit")) {
            stringLength += firstText.length();
            System.out.print("Enter a string: ");
            firstText = input.nextLine();
        }

        System.out.print("The total length is " + stringLength);
    }
}