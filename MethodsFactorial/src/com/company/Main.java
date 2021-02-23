package com.company;

public class Main {

    public static void main(String[] args) {
        int fact = 1;
	    for(int i = 1; i < 10; i++){
	        fact *= factorial(i);
	        System.out.println(i + "! = " + "" + fact);
        }
    }

    public static int factorial(int factorialValue){
        return factorialValue;
    }
}
