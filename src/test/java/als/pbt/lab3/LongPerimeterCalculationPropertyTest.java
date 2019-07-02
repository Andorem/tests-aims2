package als.pbt.lab3;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class LongPerimeterCalculationPropertyTest extends PropertyTest {
  
  @Property
  public void perimeterCalculatedCorrectly(@InRange(min = "1") final long a, final long b) {
    
    setInput(a + NL + b);
    LongPerimeterCalculation.main(new String[0]);
    long perimeter = 2 * a + 2 * b;
    String expectedOutput = "Enter width: Enter height: Perimeter: " + perimeter;
    assertEquals(expectedOutput, getOutput());
  }
}