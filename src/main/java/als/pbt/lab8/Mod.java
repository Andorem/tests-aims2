package als.pbt.lab8;

import java.util.Scanner;

public class Mod {

    public static int modBoth(int first, int second) {
        return first % second;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a second integer: ");
        int second = input.nextInt();
        System.out.println("Result: " + modBoth(first, second));
    }
}
