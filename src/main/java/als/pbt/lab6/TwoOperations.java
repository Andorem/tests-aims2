package als.pbt.lab6;

import java.util.Scanner;

public class TwoOperations {
    public static TwoDoubles multDiv(double a, double b) {
        return new TwoDoubles(a * b, a / b);
    }

    public static TwoDoubles subAdd(double a, double b) {
        return new TwoDoubles(a - b, a + b);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first double: ");
        double a = in.nextDouble();

        System.out.print("Enter second double: ");
        double b = in.nextDouble();

        TwoDoubles md = TwoOperations.multDiv(a, b);
        md.printMe();

        TwoDoubles sa = TwoOperations.subAdd(a, b);
        sa.printMe();
    }
}
