package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double firstDouble = readDouble(input);
        System.out.print("Enter second double: ");
        double secondDouble = readDouble(input);
        System.out.print("The max value is " + MethodMax(firstDouble, secondDouble));
    }

    public static double MethodMax(double first, double second){
        if(first > second){
            return first;
        } else {
            return second;
        }
    }

    private static double readDouble(Scanner input){
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
