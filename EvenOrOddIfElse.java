import java.util.Scanner;

public class EvenOrOddIfElse {
        public static void main(String[] args) {
            Scanner UserInput = new Scanner(System.in);
            System.out.print("Enter and integer number: ");
            int number = UserInput.nextInt();

            if  (number % 2 == 0)
                System.out.println(number + " is an even number.");
            if (number % 2 == 1)
                System.out.println(number + " is an odd number.");
        }
    }

