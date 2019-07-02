package als.pbt.lab9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class CompareNumsPropertyTest extends PropertyTest {
  String path = findPath("src", "CompareNums.java");

 @Property
 // if a < b, then b > a
 public void comparisonIsOppositeWhenSwapped(@InRange(max = "0") int a, @InRange(min = "1") int b) {
   String comp1 = CompareNums.comparison(a, b);
   String comp2 = CompareNums.comparison(b, a);
   assertEquals("less than greater than", comp1 + " " + comp2);
 }

 @Property
 // if a < b and b < c, then a < c
 public void comparisonIsTransitive(int a) {
   String comp1 = CompareNums.comparison(a, a + 1);
   String comp2 = CompareNums.comparison(a + 1, a + 2);
   String comp3 = CompareNums.comparison(a, a + 2);
   assertTrue(comp1.equals(comp2) && comp2.equals(comp3));
 }

 @Property
 // a == a
 public void comparisonToSelfAlwaysEqual(int a) {
   assertEquals("equal to", CompareNums.comparison(a, a));
 }

 @Property
  public void outputIsCorrect(final int a, final int b) {
    setInput(a + NL + b);
    CompareNums.main(new String[0]);
    String expectedOutput = "Enter first integer: Enter second integer: The first integer is " + comparison(a, b) + " the second integer.";
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
    "System.out.println(\"The first integer is \" + " +
    "comparison(first, second) + " +
    "\" the second integer.\");" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }

  public String comparison(int a, int b) {
    return (a == b) ? "equal to" : (a > b) ? "greater than" : "less than";
  }
}