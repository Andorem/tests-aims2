package als.pbt.lab2;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.lab2.PerimeterCalculation;

@RunWith(JUnitQuickcheck.class)
public class PerimeterCalculationPropertyTest extends als.pbt.PropertyTest {
  @Property
  public void perimeterCalculatedCorrectly(@InRange(min = "1") final int a, final int b) {
    setInput(a + NL + b);
    PerimeterCalculation.main(new String[0]);
    int perimeter = 2 * a + 2 * b;
    String expectedOutput = "Enter width: Enter height: Perimeter: " + perimeter;
    assertEquals(expectedOutput, getOutput());
  }
}