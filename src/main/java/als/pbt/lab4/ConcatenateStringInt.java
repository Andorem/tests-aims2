package als.pbt.lab4;
import java.util.Scanner;

public class ConcatenateStringInt {
    static String concatenate(String a, int b) {
        return a + b;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String myString = input.nextLine();
        System.out.print("Enter integer: ");
        int myInteger = input.nextInt();
        System.out.println("Concatenated: " +
                           concatenate(myString, myInteger));
    }
}
