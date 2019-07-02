package als.pbt.lab2;
import java.util.Scanner;

public class SquawkParrot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter something to repeat: ");
        String input = "";
        if (in.hasNextLine()) input = in.nextLine();
        System.out.println("BRAAWK " + input + "!");
        in.close();
    }
}
