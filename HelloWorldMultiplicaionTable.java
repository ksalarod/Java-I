public class while1 {
    public static void main(String[] args) {
        int k = 1;
        
        // Prevent infinite while loop
        while (k == 1) {
            System.out.println("Hello World");
            break;
        }

        // Print numbers from 1 to 9
        for (int j = 1; j <= 9; j++) {
            System.out.print(" " + j);
        }
        System.out.println("\n-----------------------------------------");

        // Print multiplication table header
        System.out.print("  | ");
        for (int j = 1; j <= 9; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        // Print multiplication table
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | "); // Print row header

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
