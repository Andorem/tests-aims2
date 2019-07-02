package als.pbt.lab9;

import java.util.Scanner;

public class CompareNums {

    public static String comparison(int first, int second) {
        String out;
        if (first < second) out = "less than";
        else if (first > second) out = "greater than";
        else out = "equal to";
        return out;
    }
   
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = input.nextInt();
        System.out.print("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("The first integer is " +
                           comparison(first, second) +
                           " the second integer.");
    }
}
