import java.util.Scanner;

public class Even0rOddSwitch {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int number = UserInput.nextInt();
        number = number % 2;
         switch (number) {
             case 1: System.out.println("Odd");
             break;
             case 2: System.out.println("Even");
             break;
            }
        }
    }
