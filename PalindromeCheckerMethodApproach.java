import java.util.Scanner;

public class PalindromeCheckerMethodApproach {

    public static String removePunctuation(String input) {
        return input.replaceAll("[\\p{Punct}]", "");
    }

    public static String removeSpaces(String input) {
        return input.replaceAll(" ", "");
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static boolean compareStrings(String original, String reversed) {
        if (original.length() != reversed.length()) {
            return false;
        }

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reversed.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void printDecision(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        String noPunctuation = removePunctuation(input);
        String noSpaces = removeSpaces(noPunctuation);
        String reversed = reverseString(noSpaces);
        boolean result = compareStrings(noSpaces, reversed);
        printDecision(result);
    }
}
