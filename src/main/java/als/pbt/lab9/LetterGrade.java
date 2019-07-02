package als.pbt.lab9;

import java.util.Scanner;

public class LetterGrade {
    // The method you write will return a String representing a letter
    // grade (e.g., "A", "A-", "B+", etc.).
    // The letter grade is determined by the given percentage, according
    // to the scale specified on page 2 of the class syllabus (available
    // here: https://kyledewey.github.io/comp110-spring18/syllabus.pdf).
    // You may assume that the given percentage is between 0.0 and 100.0
    // TODO - write your code below this comment.

    public static String letterGrade(double percentage) {
        String letterGrade;
        if (percentage >= 92.5) letterGrade = "A";
        else if (percentage >= 89.5) letterGrade = "A-";
        else if (percentage >= 86.5) letterGrade = "B+";
        else if (percentage >= 82.5) letterGrade = "B";
        else if (percentage >= 79.5) letterGrade = "B-";
        else if (percentage >= 76.5) letterGrade = "C+";
        else if (percentage >= 72.5) letterGrade = "C";
        else if (percentage >= 69.5) letterGrade = "C-";
        else if (percentage >= 66.5) letterGrade = "D+";
        else if (percentage >= 62.5) letterGrade = "D";
        else if (percentage >= 59.5) letterGrade = "D-";
        else letterGrade = "F";
        return letterGrade;
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter grade as percentage: ");
        double percentage = input.nextDouble();
        System.out.println("Letter grade: " + letterGrade(percentage));
    }
}
