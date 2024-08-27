package javaapplication;

import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String phrase;
        do {
            System.out.println("Type your password: ");
            phrase = console.nextLine();
        } while(!phrase.equals("duytan"));
    }
}
