package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        if((num1 == num2) && (num2 == num3) && (num1 == num3) ){
            System.out.print("The numbers are the same");
            return;
        }
        else if((num1 > num2) && (num1 > num3)){
            System.out.printf("The largest number is %.2f", num1);
        }
        else if((num2 > num1) && (num2 > num3)) {
            System.out.printf("The largest number is %.2f", num2);
        }
        else if((num3 > num1) && (num3 > num2)) {
            System.out.printf("The largest number is %.2f", num3);
        }

    }
}
