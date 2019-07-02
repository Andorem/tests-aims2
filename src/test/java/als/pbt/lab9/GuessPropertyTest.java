package als.pbt.lab9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class GuessPropertyTest extends PropertyTest {
  String path = findPath("src", "Guess.java");

 @Property
 public void correctChoiceWithSameSeedAlwaysSame(int a, long seed) {
   int b = Guess.makeRandomIntBetween0And2Inclusive(seed); // choose
   String res1 = Guess.isGuessCorrect(b, seed); // choose again
   assertEquals("Guess is correct!", res1);
 }

 @Property
 public void differentChoiceWithSameSeedNeverCorrect(final int a, long seed) {
  int b = Guess.makeRandomIntBetween0And2Inclusive(seed); // choose
  assumeTrue(a != b);
  String res1 = Guess.isGuessCorrect(a, seed); // choose again
  assertEquals("Guess was incorrect.  The correct guess was: " + b, res1);
 }

 @Property
  public void outputIsCorrect(final int a) {
    assumeTrue(a != 0);
    setInput(a);
    Guess.main(new String[0]);
    String expectedOutput = "Guess a number between 0 and 2, inclusive: Guess was incorrect. The correct guess was: 0";
    assertEquals(expectedOutput, getOutput());
  }

 @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner input = new Scanner(System.in); " +
    "System.out.print(\"Guess a number between 0 and 2, inclusive: \"); " +
    "int guess = input.nextInt(); " +
    "System.out.println(isGuessCorrect(guess, 123456l));" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }

  @Test
  public void makeRandoIntIsSame() throws FileNotFoundException {
    String expectedMethod = "public static int makeRandomIntBetween0And2Inclusive(long seed) { " +
    "Random random = new Random(seed); " +
    "return random.nextInt(3);" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "makeRandomIntBetween0And2Inclusive"));
  }
}