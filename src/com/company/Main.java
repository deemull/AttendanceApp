package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // output welcome message
        System.out.println("Welcome to Derrick's World! ");

        // update welcome message with name
        Scanner readInput = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = readInput.next();
        System.out.printf("Hello %s\n", name);

        // initialize ArrayList
        ArrayList<Integer> absences = new ArrayList<>();
        //add random number of absences based on length of name
        for (int i = 0; i < name.length(); i++) {

            Random rand = new Random();
            int num = rand.nextInt(11);
            absences.add(num);
        }
        System.out.println("The absences are: " + absences);
        System.out.println("Average absences are: " + average(absences));
        System.out.println("Percentage of perfect attendance: " + percentageOfPerfectAttends(absences) + "%");
        System.out.printf("Number of absences? ");
        int num = readInput.nextInt();
        System.out.printf("These students had " + xAbsences(absences, num) + "absences\n");
        System.out.printf("Absences required to FE? ");
        num = readInput.nextInt();
        System.out.printf("%f students FE'd the course", percentageOfStudentsFE(absences, num));

        //Collections.sort(absences);
    }

    private static double average(ArrayList<Integer> list) {
        return sumOfAbsences(list) / (double) list.size();
    }

    private static double sumOfAbsences(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    private static double percentageOfPerfectAttends(ArrayList<Integer> list) {
        double count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                count++;
            }
        }
        return count;
    }

    private static ArrayList<Integer> xAbsences(ArrayList<Integer> list, int num) {
        ArrayList<Integer> numAbsences = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(num)) {
                numAbsences.add(i);
            }
        }
        return numAbsences;
    }

    private static double percentageOfStudentsFE(ArrayList<Integer> list, int num) {
        ArrayList<Integer> feAbsences = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (num >= (list.get(i) * 2)) {
                count++;
                feAbsences.add(i);
            }
        }
        return count;
    }

}
