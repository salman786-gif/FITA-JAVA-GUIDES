package fita.guides.core.java;

import java.util.Scanner;

/**
 * Demonstrates how Java characters are represented by numeric Unicode values.
 * For the basic English characters shown here, these values match ASCII.
 */
public class ASCIIValuesDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ASCII / Character Values");
        System.out.println("------------------------");

        char upper = 'A';
        char lower = 'a';
        char digit = '0';

        System.out.println("Character: " + upper + "  Numeric value: " + (int) upper);
        System.out.println("Character: " + lower + "  Numeric value: " + (int) lower);
        System.out.println("Character: " + digit + "  Numeric value: " + (int) digit);

        System.out.print("\nEnter one character: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("No character was entered.");
        } else {
            char character = input.charAt(0);
            System.out.println("Character: " + character);
            System.out.println("Numeric value: " + (int) character);
        }

        System.out.println("\nA to Z:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }

        scanner.close();
    }
}
