import java.util.Random;
import java.util.Scanner;

public class J104_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two alphabet characters without space
        System.out.print("Enter two alphabet characters: ");
        String input = scanner.nextLine();

        // Check if the input is exactly two characters
        if (input.length() != 2) {
            System.out.println("Please enter two with no spaces.");
            return;
        }

        // Get the first and second characters from the input string
        char firstInput = input.charAt(0);
        char secondInput = input.charAt(1);

        // Generate a random sequence of five uppercase alphabet characters
        Random random = new Random();
        StringBuilder sequence = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            char randomChar = (char) ('A' + random.nextInt(26)); // Random character from A to Z
            sequence.append(randomChar);
        }

        // Get the first and last characters from the generated sequence
        char firstChar = sequence.charAt(0);
        char lastChar = sequence.charAt(sequence.length() - 1);

        // Compare the inputs with the sequence
        boolean firstInputCorrect = (firstInput == firstChar);
        boolean secondInputCorrect = (secondInput == lastChar);


        if (firstInputCorrect && secondInputCorrect) {
            System.out.println("Both are correct.");
        } else if (!firstInputCorrect && !secondInputCorrect) {
            System.out.println("Both are wrong.");
        } else {
            if (firstInputCorrect) {
                System.out.println("The first one (" + firstInput + ") is correct.");
            } else {
                System.out.println("The second one (" + secondInput + ") is correct.");
            }
        }

        // Display the generated sequence and comparison details
        System.out.println("Generated sequence is " + sequence + " <-You should compare " + firstInput + " with " + firstChar + ", " + secondInput + " with " + lastChar);

        scanner.close();
    }
}
