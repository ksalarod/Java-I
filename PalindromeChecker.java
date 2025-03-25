import java.util.Scanner;

public class J105_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Palindrome checker, enter 0 to exit: ");
            String s = input.nextLine(); // user input stored in s variable

            if (s.equals("0")) {
                break; // program exits if 0 is entered
            }

            s = s.toLowerCase(); // converts user input to lowercase

            int first = 0; //first character at index 0
            int last = s.length() - 1; // last character at index -1
            boolean isPalindrome = true; // boolean

            while (first < last) {
                //compares first and last character only if it is first is less than last and doesn't have a space
                while (first < last && s.charAt(first) == ' ') {
                    first++; //compares first character to last ignoring spaces until it points to a character moves forward by one
                }
                //compares first and last character only if first is less than last and doesn't have a space
                while (first < last && s.charAt(last) == ' ') {
                    last--; //compares last character to first ignoring spaces until it points to a character moving backwards by one
                }

                if (s.charAt(first) != s.charAt(last)) { //if they are not the same loop stops and returns false
                    isPalindrome = false;
                    break;
                }

                first++; //moves index comparison forwards
                last--; //moves index comparison backwards
            }

            if (isPalindrome) {
                System.out.println("Yes"); //if letter compared were the same on both sides return true
            } else {
                System.out.println("No"); //because it returned false message of no displayed
            }
        }

        input.close();
    }
}

