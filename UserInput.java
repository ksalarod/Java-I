// Simple program that receives user input through a scanner object
// import statements can only go before class
import java.util.Scanner;
// class named userInput
public class userInput { //opening braces for class

    public static void main(String[] args) { //opening braces for main method
        // Scanner object created named input. User input stored here.
        Scanner input = new Scanner(System.in);
        // User is prompted at the console to enter something.
        System.out.print("Enter user input: ");
        // User input is assigned to variable named number that accepts double or decimal
        double number = input.nextDouble();
        // Console output
        System.out.println("You entered: " + number);
        // Scanner closed
        input.close();

    } //closing braces for main method
} //closing braces for class
