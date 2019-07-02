package als.pbt.lab6;

import java.util.Scanner;

public class TwoDoubles {
    double first, second;

    public TwoDoubles(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void printMe() {
        System.out.print("First: " + first + "\nSecond: " + second);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double first = input.nextDouble();
        System.out.print("Enter second double: ");
        double second = input.nextDouble();

        TwoDoubles two = new TwoDoubles(first, second);
        two.printMe();
    }
}
