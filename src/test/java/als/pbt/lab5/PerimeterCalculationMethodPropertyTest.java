package als.pbt.lab5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class PerimeterCalculationMethodPropertyTest extends PropertyTest {
  String path = findPath("src", "PerimeterCalculationMethod.java");
 
  @Property
  public void perimeterCalculatedCorrectly(final int a, final int b) {
    assertEquals(2 * a + 2 * b, PerimeterCalculationMethod.calculatePerimeter(a, b));
  }

  @Property
  public void outputIsCorrect(final int a, final int b) {
    setInput(a + NL + b);
    PerimeterCalculationMethod.main(new String[0]);
    int perimeter = 2 * a + 2 * b;
    String expectedOutput = "Enter width: Enter height: Perimeter: " + perimeter;
    assertEquals(expectedOutput, getOutput());
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner in = new Scanner(System.in); " +
    "System.out.print(\"Enter width: \"); " +
    "int width = in.nextInt(); " +
    "System.out.print(\"Enter height: \"); " +
    "int height = in.nextInt(); " +
    "int perimeter = calculatePerimeter(width, height); " +
    "System.out.println(\"Perimeter: \" + perimeter);" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }

  
}