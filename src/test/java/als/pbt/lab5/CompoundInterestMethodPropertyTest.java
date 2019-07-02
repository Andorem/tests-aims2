package als.pbt.lab5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;
import als.pbt.lab3.CompoundInterest;

@RunWith(JUnitQuickcheck.class)
public class CompoundInterestMethodPropertyTest extends PropertyTest {
  String path = findPath("src", "CompoundInterestMethod.java");

  @Property
  public void interestCalculatedCorrectly(final long p, final double r, final int n, final int t) {
    assertEquals(p * Math.pow(1 + r / n, n * t), CompoundInterestMethod.compoundInterest(p, r, n, t), .001);
  }
  @Property
  public void outputIsCorrect(final long p, final double r, final int n, final int t) {
    setInput(p + NL + r + NL + n + NL + t);
    CompoundInterest.main(new String[0]);
    double compoundInterest = p * Math.pow(1 + r / n, n * t);
    String expectedOutput = "Enter principle (long): Enter annual interest rate (double): Enter number of times interest is compounded per year (int): Enter number of years invested (int): Compound interest including principal: " + compoundInterest;
    assertEquals(expectedOutput, getOutput());
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { "
      + "Scanner in = new Scanner(System.in); "
      + "System.out.print(\"Enter principle (long): \"); "
      + "long p = in.nextLong(); "
      + "System.out.print(\"Enter annual interest rate (double): \"); "
      + "double r = in.nextDouble(); "
      + "System.out.print(\"Enter number of times interest is compounded per year (int): \"); "
      + "int n = in.nextInt(); "
      + "System.out.print(\"Enter number of years invested (int): \"); "
      + "int t = in.nextInt(); "
      + "double a = compoundInterest(p, r, n, t); "
      + "System.out.println(\"Compound interest including principal: \" + a);"
    + "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
  
}