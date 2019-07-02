package als.pbt.lab2;

import java.util.Scanner;

/**
 * PerimeterCalculation
 */
public class PerimeterCalculation {
    public static void main(String[] args) {
        int width, height, perimeter;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter width: ");
        width = in.nextInt();

        System.out.println("Enter height: ");
        height = in.nextInt();

        perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
        in.close();
    }
}