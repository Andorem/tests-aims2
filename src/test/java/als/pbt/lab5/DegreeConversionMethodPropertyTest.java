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
public class DegreeConversionMethodPropertyTest extends PropertyTest {
  String path = findPath("src", "DegreeConversionMethod.java");

  @Property
  public void celciusConvertedCorrectly(final double c) {
    assertEquals(c * 1.8 + 32, DegreeConversionMethod.convert(c), .001);
  }
  @Property
  public void outputIsCorrect(double c) {
    setInput(Double.toString(c));
    DegreeConversionMethod.main(new String[0]);
    double f = c * 1.8 + 32;
    String expectedOutput = "Enter temperature in Celsius: Fahrenheit: " + f;
    assertEquals(expectedOutput, getOutput());
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner in = new Scanner(System.in); " +
    "System.out.print(\"Enter temperature in Celsius: \"); " +
    "double c = in.nextDouble(); " +
    "double f = convert(c); " +
    "System.out.println(\"Fahrenheit: \" + f);" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
  
}