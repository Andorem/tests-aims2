package als.pbt.lab11;

import java.util.Scanner;

public class MonthsOnAndAfter {
    // You will need to write a method that makes this
    // code compile and produce the correct output.
    // YOU MUST USE switch!
    // As a hint, you should not have to use the name of each
    // month more than once.
    // TODO - write your code below this comment.

    public static void printMonthsOnAndAfter(int num) {
        switch(num) {
            case 0:
                System.out.println("January");
            case 1:
                System.out.println("February");
            case 2:
                System.out.println("March");
            case 3:
                System.out.println("April");
            case 4:
                System.out.println("May");
            case 5:
                System.out.println("June");
            case 6:
                System.out.println("July");
            case 7:
                System.out.println("August");
            case 8:
                System.out.println("September");
            case 9:
                System.out.println("October");
            case 10:
                System.out.println("November");
            case 11:
                System.out.println("December");
        }
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (0-11): ");
        int month = input.nextInt();
        printMonthsOnAndAfter(month);
    }
}
