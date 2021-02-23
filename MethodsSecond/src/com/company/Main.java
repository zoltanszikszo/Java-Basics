package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        int widthValue = Integer.parseInt(input.nextLine());
        System.out.print("Enter height: ");
        int heightValue = Integer.parseInt(input.nextLine());
        System.out.println("");
        printRectangle(widthValue, heightValue);
    }

    static void printRectangle(int w, int h) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }
}
