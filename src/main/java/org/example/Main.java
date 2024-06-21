package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation: ");
            System.out.println("1. Add" +
                    "\n2. Subtract" +
                    "\n3. Multiply" +
                    "\n5. Exit");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = calculator.add(num1, num2);
                    break;
                case 2:
                    result = calculator.subtract(num1, num2);
                    break;
                case 3:
                    result = calculator.multiply(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}