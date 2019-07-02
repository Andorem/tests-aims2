package als.pbt.lab9;

import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static String isGuessCorrect(int guess, long seed) {
        int chosen = makeRandomIntBetween0And2Inclusive(seed);
        if (guess == chosen) return "Guess is correct!";
        else return "Guess was incorrect.  The correct guess was: " + chosen;
    }
    
    // DO NOT MODIFY makeRandomIntBetween0And2Inclusive!
    public static int makeRandomIntBetween0And2Inclusive(long seed) {
        Random random = new Random(seed);
        return random.nextInt(3);
    }
    
    // DO NOT MODIFY main!
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess a number between 0 and 2, inclusive: ");
        int guess = input.nextInt();
        System.out.println(isGuessCorrect(guess, 123456l));
    }
}
