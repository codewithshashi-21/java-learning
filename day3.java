// Day 3 – Loops (for, while)

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // while loop
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        sc.close();
    }
}