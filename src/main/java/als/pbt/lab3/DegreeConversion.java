package als.pbt.lab3;

import java.util.Scanner;

/**
 * DegreeConversion
 */
public class DegreeConversion {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        celsius = in.nextDouble();

        fahrenheit = celsius * 1.8 + 32;
        System.out.println("Fahrenheit: " + fahrenheit);

        in.close();
    }
}