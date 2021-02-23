package com.company;

public class Main {

    public static void main(String[] args) {
        printNumbers();
    }
    public static void printNumbers(){
        for(int i = 2; i <= 50; i += 2){
            System.out.print(i + " ");
        }
    }
}
