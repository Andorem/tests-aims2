package als.pbt.lab3;


import java.util.Scanner;

public class LongPerimeterCalculation {
    public static void main(String[] args) {
        long width, height, perimeter;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter width: ");
        width = in.nextLong();

        System.out.println("Enter height: ");
        height = in.nextLong();

        perimeter = 2 * width + 2 * height;
        System.out.println("Perimeter: " + perimeter);
        in.close();
    }
}