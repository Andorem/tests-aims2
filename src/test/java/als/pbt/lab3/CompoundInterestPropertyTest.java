package als.pbt.lab3;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class CompoundInterestPropertyTest extends PropertyTest {
  
  @Property
  public void interestCalculatedCorrectly(final long p, final double r, final int n, final int t) {
    
    setInput(p + NL + r + NL + n + NL + t);
    CompoundInterest.main(new String[0]);
    double compoundInterest = p * Math.pow(1 + r / n, n * t);
    String expectedOutput = "Enter principle (long): Enter annual interest rate (double): Enter number of times interest is compounded per year (int): Enter number of years invested (int): Compound interest including principal: " + compoundInterest;
    assertEquals(expectedOutput, getOutput());
  }
}