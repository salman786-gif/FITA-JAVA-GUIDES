package fita.guides.core.java;

/**
 * Beginner-friendly examples of creating, traversing and searching arrays.
 */
public class ArrayPractice {

    public static void main(String[] args) {
        // 1. Create and initialize an integer array.
        int[] numbers = {25, 10, 45, 5, 30};

        // 2. Print values using a normal for loop.
        System.out.println("Array elements using for loop:");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Index " + index + " = " + numbers[index]);
        }

        // 3. Print values using an enhanced for-each loop.
        System.out.println("\nArray elements using for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 4. Find the largest and smallest values.
        int largest = numbers[0];
        int smallest = numbers[0];
        int total = 0;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
            total += number;
        }

        System.out.println("\nLargest number: " + largest);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Total: " + total);
        System.out.println("Average: " + (double) total / numbers.length);

        // 5. Search for a value in the array.
        int searchValue = 45;
        int foundIndex = -1;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == searchValue) {
                foundIndex = index;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(searchValue + " found at index " + foundIndex);
        } else {
            System.out.println(searchValue + " was not found");
        }
    }
}
