// Day 2 – Operators and a simple calculator

import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int result;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                sc.close();
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operator");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}