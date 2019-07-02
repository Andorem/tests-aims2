package als.pbt.lab3;
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        long principle;
        double rate, compoundInterest;
        int compoundFreq, years;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter principle (long): ");
        principle = in.nextLong();
        
        System.out.print("Enter annual interest rate (double): ");
        rate = in.nextDouble();

        System.out.print("Enter number of times interest is compounded per year (int): ");
        compoundFreq = in.nextInt();

        System.out.print("Enter number of years invested (int): ");
        years = in.nextInt();

        compoundInterest = principle * Math.pow(1 + rate / compoundFreq, compoundFreq * years);
        System.out.print("Compound interest including principal: " + compoundInterest);
    }
}
