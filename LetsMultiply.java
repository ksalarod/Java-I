import java.util.Scanner;

public class LetsMultiply {

    public static double[] userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Type in the second number: ");
        double num2 = scanner.nextDouble();

        return new double[] { num1, num2 };
    }

    public static double calculation(double num1, double num2) {
        return num1 * num2;
    }

    public static void printout(double result) {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        double[] numbers = userInput();
        double result = calculation(numbers[0], numbers[1]);
        printout(result);
    }
}

