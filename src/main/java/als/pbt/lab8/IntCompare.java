package als.pbt.lab8;

import java.util.Scanner;

public class IntCompare {
    
    public static boolean firstIsLessThanSecond(int first, int second) {
        return first < second;
    }

    public static boolean firstIsGreaterThanSecond(int first, int second) {
        return first > second;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("Less than: " + firstIsLessThanSecond(first, second));
        System.out.println("Greater than: " + firstIsGreaterThanSecond(first, second));
    }
}
