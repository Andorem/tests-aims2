package als.pbt.lab5;

import java.util.Scanner;

public class PerimeterCalculationMethod {
    public static int calculatePerimeter(int a, int b) {
        return 2 * a + 2 * b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter width: ");
        int width = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();
        int perimeter = calculatePerimeter(width, height);
        System.out.println("Perimeter: " + perimeter);
    }
}
