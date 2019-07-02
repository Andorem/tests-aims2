package als.pbt.lab3;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class DegreeConversionPropertyTest extends PropertyTest {
  @Property
  public void celsiusConvertedToFahrenheit(final double c) {
    setInput(Double.toString(c));
    DegreeConversion.main(new String[0]);
    double f = c * 1.8 + 32;
    String expectedOutput = "Enter temperature in Celsius: Fahrenheit: " + f;
    assertEquals(expectedOutput, getOutput());
  }
}