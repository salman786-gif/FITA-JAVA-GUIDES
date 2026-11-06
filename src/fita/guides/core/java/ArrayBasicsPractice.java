package fita.guides.core.java;

/**
 * Beginner practice for declaring, traversing, and finding values in an array.
 */
public class ArrayBasicsPractice {

    public static void main(String[] args) {
        int[] marks = {80, 75, 90, 85, 95};

        System.out.println("Array values using an indexed for loop:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Index " + i + " = " + marks[i]);
        }

        System.out.println("\nArray values using a for-each loop:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        int largest = marks[0];
        int smallest = marks[0];
        int total = 0;

        for (int mark : marks) {
            if (mark > largest) {
                largest = mark;
            }
            if (mark < smallest) {
                smallest = mark;
            }
            total += mark;
        }

        double average = (double) total / marks.length;

        System.out.println("\nLargest value  = " + largest);
        System.out.println("Smallest value = " + smallest);
        System.out.println("Total          = " + total);
        System.out.println("Average        = " + average);
    }
}
