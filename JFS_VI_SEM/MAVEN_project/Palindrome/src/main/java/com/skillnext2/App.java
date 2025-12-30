package com.skillnext2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int rem = num % 10;   // get last digit
            reverse = reverse * 10 + rem; // build reverse number
            num = num / 10; // remove last digit
        }

        if (original == reverse)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is NOT a Palindrome.");
    }
}