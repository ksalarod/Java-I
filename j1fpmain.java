import java.util.Scanner;

public class j1fp {
    public static void main(String[] args) {
        // Inventory array
        RetailItem[] inventory = {
                new RetailItem("001", "Jacket", 12, 59.95),
                new RetailItem("002", "Jeans", 40, 34.95),
                new RetailItem("003", "Shirt", 20, 24.95)
        };

        CashRegister register = new CashRegister();
        Scanner scanner = new Scanner(System.in);
        boolean shopping = true;

        while (shopping) {
            // Items available
            System.out.println("\nAvailable Items:");
            for (int i = 0; i < inventory.length; i++) {
                RetailItem item = inventory[i];
                System.out.printf("%d. %s  $%.2f (%d in stock)%n",
                        i + 1, item.getDescription(), item.getPrice(), item.getUnitsOnHand());
            }

            System.out.print("Enter item number 1-3, or 0 to checkout: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                shopping = false;
            } else if (choice >= 1 && choice <= inventory.length) {
                RetailItem selectedItem = inventory[choice - 1];
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                register.addItem(selectedItem, quantity);
            } else {
                System.out.println("Error.");
            }
        }

        // Print receipt
        SalesReceipt receipt = new SalesReceipt(register);
        receipt.printReceipt();
        scanner.close();
    }
}

