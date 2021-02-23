package com.company;

import java.util.Scanner;

public class SumOfTwoIntegers{

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        int value = first+second;
        System.out.println();
        System.out.print(first + " + " + second + " = " + value);
    }
}
