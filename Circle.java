/*
Assignment Summary:
  Use constructors, getters, and setters to compute the area of circles using radii of 1, 10, and 100.

 */
import java.util.Scanner;

public class Circle {
    //instance variables
    private double area;
    private double radius;
   //constructor
    public Circle(double radius) {
        this.radius = radius;
        setArea();
    }
   //method containing formula for finding area of a circle using radius
    private void setArea() {
        area = Math.PI * radius * radius;
    }
  //method to print area
    public void getArea() {
        System.out.println("Area is: " + area);
    }
  //main method
    public static void main(String[] args) {
        //scanner object for user input
        Scanner scanner = new Scanner(System.in);
        double radius;

        System.out.print("Enter radius, 0 to exit: ");
        //user input double value assigned to radius variable
        radius = scanner.nextDouble();
        //while loop to allow multiple calcualtions
        while (radius != 0) {
            Circle circle = new Circle(radius);
            circle.getArea();

            System.out.print("Enter radius, 0 to exit: ");
            radius = scanner.nextDouble();
        }
        //Close scanner the end!
        scanner.close();
    }
}

/*
Documentation:

Main:
Allow user input of radii 1, 10, 100. 0 to finish.
Send radius to circle constructor and setArea to evaluate.
Call getArea to print results.

Circle class:
Circle constructor receives radius from scanner object

setArea:
Formula for calculating area of a circle using radius

getArea:
Print area

While loop:
allows the ability to calculate area for multiple circles

*/
