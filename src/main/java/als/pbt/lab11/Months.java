package als.pbt.lab11;

import java.util.Scanner;

public class Months {
    // You will need to write a method that makes this
    // code compile and produce the correct output.
    // YOU MUST USE switch!
    // TODO - write your code below this comment.

    public static String monthAsString(int num) {
        String month;
        switch(num) {
            case 0:
                month = "January";
                break;
            case 1:
                month = "February";
                break;
            case 2:
                month = "March";
                break;
            case 3:
                month = "April";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "August";
                break;
            case 8:
                month = "September";
                break;
            case 9:
                month = "October";
                break;
            case 10:
                month = "November";
                break;
            case 11:
                month = "December";
                break;
            default:
                month = "Out of range";
        }
        return month;
    }

    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month (0-11): ");
        int month = input.nextInt();
        String output = monthAsString(month);
        System.out.println(output);
    }
}
