package als.pbt.lab8;

import java.util.Random;
import java.util.Scanner;

public class MinMax {

    
    public static int min(int a, int b) {
        if (a == b) return a;
        else if (a < b) return a;
        else return b;
    }

    public static int max(int a, int b) {
        if (a == b) return a;
        else if (a > b) return a;
        else return b;
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("Min: " + min(first, second));
        System.out.println("Max: " + max(first, second));
    }
}
