package com.bridgelabz;

import java.util.Scanner;

public class LogicalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to reverse  :");
        int num = sc.nextInt();
        System.out.println("The reverse of the given number is:");
        reverseNumber(num);
        sc.close();
    }
    /* Method use:
     * prints the same number if the number is less than 10
     * calculate the remainder of the number using the modulo
     */
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }
}
