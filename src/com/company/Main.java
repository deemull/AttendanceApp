package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Derrick's World! ");

        Scanner readInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = readInput.next();
        System.out.printf("Hello %s", name);

    }
}
