package org.example;

import java.util.Scanner;

public class NumberCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double res = 0;
        boolean calculating = true;

        System.out.println("Enter an operation. Ex. (+, -, *, /) or press 'q' to quit:");

        while (calculating) {
            String opr = sc.nextLine();

            switch (opr) {
                case "+":
                    System.out.print("Enter a number to add: ");
                    res += sc.nextDouble();
                    break;
                case "-":
                    System.out.print("Enter a number to subtract: ");
                    res -= sc.nextDouble();
                    break;
                case "*":
                    System.out.print("Enter a number to multiply: ");
                    res *= sc.nextDouble();
                    break;
                case "/":
                    System.out.print("Enter a number to divide: ");
                    double div = sc.nextDouble();
                    if (div != 0) {
                        res /= div;
                    } else {
                        System.out.println("You cannot divide by zero!");
                    }
                    break;

                case "q":
                    calculating = false;
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
            sc.nextLine();

            System.out.println("Current result: " + res); // Display the current result after each operation
        }
        System.out.println("The final result is: " + res);
        sc.close();
    }
}
