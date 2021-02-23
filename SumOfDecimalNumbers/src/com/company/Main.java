package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        BigDecimal firstNum = new BigDecimal(input.nextLine().replace(',', '.'));
        System.out.print("Enter second number: ");
        BigDecimal secondNum = new BigDecimal(input.nextLine().replace(',', '.'));
        BigDecimal sum = firstNum.add(secondNum);
        System.out.print(sum);
    }
}