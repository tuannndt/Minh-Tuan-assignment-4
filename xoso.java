package javaapplication;

import java.util.Random;
import java.util.Scanner;

public class xoso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter your number (1-100): ");
        int number = sc.nextInt();
        int luckyNumber = rand.nextInt(100) + 1;
        System.out.println("Lucky number is: " + luckyNumber);
        if(number == luckyNumber) {
            System.out.println("You are so lucky!");
        } else {
            System.out.println("Good luck next time!");
        }          
    }
}
