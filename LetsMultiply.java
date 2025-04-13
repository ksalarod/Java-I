/*
Summary of assignment: 
Write a program that prompts the user to input two numbers, calculates their multiplication, and prints
out the result.
    a. The program should have three separate methods: userInput(), calculation(), printout()
    b. The main() should be kept as simple as possible.

 */

import java.util.Scanner;

public class LetsMultiply {                                                                                          

    public static double[] userInput() { //method that uses an array to pass two numbers of double type
        Scanner scanner = new Scanner(System.in); // scanner object created for user input that's going into array

        System.out.print("Type in the first number: "); // input received for num1
        double num1 = scanner.nextDouble(); //input goes into scanner

        System.out.print("Type in the second number: "); // input received for num2
        double num2 = scanner.nextDouble(); //input goes into scanner

        return new double[] { num1, num2 }; // array is updated to num 1 is at 0 and num2 is at 1
    }

    public static double calculation(double num1, double num2) { //method for multiplying two numbers
        return num1 * num2;
    }
    // method for printing out the product of two numbers
    public static void printout(double num1, double num2, double product) { 
        System.out.println(num1 + " X " + num2 + " = " + product);
    }

    public static void main(String[] args) { // main method that calls userinput, calculation & printout method
        double[] numbers = userInput(); //calls user input
        double product = calculation(numbers[0], numbers[1]); //calls calculation
        printout(numbers[0], numbers[1], product); //calls printout
    }
}

/*documentation: Three methods are created to divide and conquer the job of multiplying two numbers input by users
-The method user input accepts user input by creating a scanner object that puts two values into an array
-The method calculation multiplies num 1 by num 2
-The method printout prints out the two numbers being multiplied and the product of the two numbers
-The main method uses the three methods to execute the assignment 
*/

