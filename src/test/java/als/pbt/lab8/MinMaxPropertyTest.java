package als.pbt.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class MinMaxPropertyTest extends PropertyTest {
  String path = findPath("src", "MinMax.java");

 @Property
 public void biggestIsMax(final int a, final int b) {
   assertEquals(Math.max(a, b), MinMax.max(a, b));
 }

 @Property
 public void smallestIsMin(final int a, final int b) {
   assertEquals(Math.min(a, b), MinMax.min(a, b));
 }

 @Property
 public void sameIsEither(final int a) {
   assertEquals(a, MinMax.min(a, a));
   assertEquals(a, MinMax.max(a, a));
 }

 @Property
  public void outputIsCorrect(final int a, final int b) {
    setInput(a + NL + b);
    MinMax.main(new String[0]);
    String expectedOutput = "Enter first integer: Enter second integer: Min: " + Math.min(a, b) + "Max: " + Math.max(a, b);
    assertEquals(expectedOutput, getOutput());
  }

 @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
      "Scanner input = new Scanner(System.in); " +
      "System.out.print(\"Enter first integer: \"); " +
      "int first = input.nextInt(); " +
      "System.out.print(\"Enter second integer: \"); " +
      "int second = input.nextInt(); " +
      "System.out.println(\"Min: \" + min(first, second)); " +
      "System.out.println(\"Max: \" + max(first, second));" +
      "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}