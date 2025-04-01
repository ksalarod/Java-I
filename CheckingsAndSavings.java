import java.util.Scanner;

public class j1mp_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop iterates 5 times so the arguments assigned in midterm are all tested
        for (int i = 0; i < 5; i++) {
            // Prompt users for input to perform calculations
            System.out.print("Please enter the following in this exact order with spaces in between: account number, 'S' for savings or 'C' for checking, min balance, current balance: ");
            // user input read as int using this library function
            int accountNumber = scanner.nextInt();
            // library function for accepting first character
            char accountType = scanner.next().charAt(0);
            // current and min balance read as double since were dealing with money
            double minimumBalance = scanner.nextDouble();
            double currentBalance = scanner.nextDouble();

            double newBalance = currentBalance;

            // switch statement used to determine fees and interest
            // lower and uppercase can be used with this library function
            switch (Character.toUpperCase(accountType)) {
                case 'S': // Savings
                    if (currentBalance < minimumBalance) {
                        newBalance -= 10.00; // below min fee is charged
                    } else {
                        newBalance += (currentBalance * 0.04); // 4% interest applied when needed
                    }
                    break;

                case 'C': // Checking
                    if (currentBalance < minimumBalance) {
                        newBalance -= 25.00; // below min fee charged
                    } else if (currentBalance <= minimumBalance + 5000) {
                        newBalance += (currentBalance * 0.03); // 3% interest after 5000
                    } else {
                        newBalance += (currentBalance * 0.05); // 5% interest for first 5000
                    }
                    break;

                default:
                    System.out.println("Error enter 'S' or 'C'.");
                    continue; // Error message for incorrect user input
            }

            // Output account details and new balance
            System.out.printf("Account Number: %d%n", accountNumber);
            System.out.printf("Account Type: %c%n", accountType);
            System.out.printf("Current Balance: $%.2f%n", currentBalance);
            System.out.printf("New Balance: $%.2f%n", newBalance);
            System.out.println();
        }
        //scanner is closed
        scanner.close();
        // done :)
    }
}
