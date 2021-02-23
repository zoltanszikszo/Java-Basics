package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    try{
	        System.out.print("Enter grade (0-5): ");
	        int inputValue = Integer.parseInt(input.nextLine());

	        System.out.println("OK");
        }
	    catch (NumberFormatException nfe){
	        System.out.println("Please enter an integer.");
        }
    }
}
