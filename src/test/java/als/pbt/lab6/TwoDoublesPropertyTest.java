package als.pbt.lab6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class TwoDoublesPropertyTest extends PropertyTest {
  String path = findPath("src", "TwoDoubles.java");

  @Property 
  public void printsFirstAndSecond(final double a, final double b) {
    TwoDoubles td = new TwoDoubles(a, b);
    td.printMe();
    assertEquals("First: " + a + "Second: " + b, getOutput());
  }

  @Property
  public void outputIsCorrect(final double a, final double b) {
    setInput(a + NL + b);
    TwoDoubles.main(new String[0]);
    String expectedOutput = "Enter first double: Enter second double: First: " + a + "Second: " + b;
    assertEquals(expectedOutput, getOutput());
  }

  @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner input = new Scanner(System.in); " +
    "System.out.print(\"Enter first double: \"); " +
    "double first = input.nextDouble(); " +
    "System.out.print(\"Enter second double: \"); " +
    "double second = input.nextDouble(); " +
    "TwoDoubles two = new TwoDoubles(first, second); " +
    "two.printMe();" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}