package javaapplication;

import java.util.Random;
import java.util.Scanner;

public class AddingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int points = 0;
        int wrong = 0;
        do {
            int rd = rand.nextInt(4) + 2;
            int sum = rand.nextInt(10) + 1;
            System.out.print(sum);
            for(int i=1;i<=rd;i++) {
                int number = rand.nextInt(10) + 1;
                System.out.print(" + " + number);
                sum = sum + number;
            }
            System.out.print(" = ");
            int answer = sc.nextInt();
            if(answer == sum) {
                points++;
            } else {
                System.out.println("Wrong! The answer was " + sum);
                wrong++;
            }
        } while( wrong < 3);
        System.out.println("You earned " + points + " total points.");
    }
}
