package als.pbt.lab4;
import java.util.Scanner;

public class MultiplyBoth {
    public static int multiplyBoth(int first, int second) {
        return first * second;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        System.out.println("Result: " + multiplyBoth(first, second));
    }
}
