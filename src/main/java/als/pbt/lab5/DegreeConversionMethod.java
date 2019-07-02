package als.pbt.lab5;

import java.util.Scanner;

public class DegreeConversionMethod {
    // TODO - write your code below this comment.
    // You need to write a method that will allow this
    // to compile and return the correct result when run.
    //
    // The method you need to write is called in main.
    // As a hint, try to figure out what method specification
    // you'll need in order to make this compile.
    // The code you write will reuse code you wrote in lab 3.
    
    // DO NOT MODIFY main!
    public static double convert(double c) {
        return c * 1.8 + 32;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = in.nextDouble();
        double f = convert(c);
        System.out.println("Fahrenheit: " + f);
    }
}
