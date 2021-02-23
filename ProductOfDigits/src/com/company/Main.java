package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int inputValue = Integer.parseInt(input.nextLine());
        int product = 1;
        if (inputValue == 0) {
            product = 0;
        } else {
            while (inputValue != 0) {
                product = product * (inputValue % 10);
                inputValue = inputValue / 10;
            }
        }
        System.out.print(Math.abs(product));
    }
}
