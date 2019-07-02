package als.pbt.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class IntComparePropertyTest extends PropertyTest {
  String path = findPath("src", "IntCompare.java");

 @Property
 public void greaterThanOppositeLessThan(int a, int b) {
   assertEquals(IntCompare.firstIsGreaterThanSecond(a, b), !IntCompare.firstIsLessThanSecond(a, b));
 }

 @Property
 public void comparisonReverses(int a, int b) {
   assertNotEquals(IntCompare.firstIsGreaterThanSecond(a, b), IntCompare.firstIsGreaterThanSecond(b, a));
   assertNotEquals(IntCompare.firstIsLessThanSecond(a, b), IntCompare.firstIsLessThanSecond(b, a));
 }

 @Property
  public void outputIsCorrect(final int a, final int b) {
    setInput(a + NL + b);
    IntCompare.main(new String[0]);
    String expectedOutput = "Enter first integer: Enter second integer: Less than: " + (a < b) + "Greater than: " + (a > b);
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
      "System.out.println(\"Less than: \" + firstIsLessThanSecond(first, second)); " +
      "System.out.println(\"Greater than: \" + firstIsGreaterThanSecond(first, second));" +
      "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}