package fita.guides.core.java;

/**
 * Demonstrates the ASCII values of common characters.
 * Java stores a char as a numeric code value.
 */
public class AsciiTableDemo {

    public static void main(String[] args) {
        System.out.println("ASCII values of common characters");
        System.out.println("---------------------------------");
        System.out.printf("%-12s %-12s%n", "Character", "ASCII value");

        // Print the printable basic ASCII range.
        for (int value = 32; value <= 126; value++) {
            char character = (char) value;

            // Give space a readable name instead of printing a blank.
            String display = (character == ' ') ? "SPACE" : String.valueOf(character);
            System.out.printf("%-12s %-12d%n", display, value);
        }

        System.out.println();
        char letter = 'A';
        int asciiValue = letter;
        System.out.println("Example:");
        System.out.println("Character: " + letter);
        System.out.println("ASCII value: " + asciiValue);

        // Convert an ASCII number back into its character.
        int number = 97;
        char convertedCharacter = (char) number;
        System.out.println("Character for ASCII value " + number + ": " + convertedCharacter);
    }
}
