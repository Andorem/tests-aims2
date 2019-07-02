package als.pbt.lab6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.symbolsolver.javaparser.Navigator;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class TwoOperationsPropertyTest extends PropertyTest {
  String path = findPath("src", "TwoOperations.java");
  MethodDeclaration main = getMethod(path, "main");

  @Property
  public void outputPrintsInstances(double a, double b) {
    setInput(a + NL + b);
    TwoOperations.main(new String[0]);
    String expectedOutput = "Enter first double: Enter second double: " +
      "First: " + (a * b) + "Second: " + (a / b) +
      "First: " + (a - b) + "Second: " + (a + b);
    assertEquals(expectedOutput, getOutput());
  }

  @Test
  public void mainCallsMultDiv() {
    MethodCallExpr mdCall = Navigator.findMethodCall(main, "multDiv").get();
    assertTrue(mdCall != null);
  }

  @Test
  public void mainCallsSubAdd() {
    MethodCallExpr saCall = Navigator.findMethodCall(main, "subAdd").get();
    assertTrue(saCall != null);
  }

  @Test
  public void mainCallsPrintMe() {
    MethodCallExpr pmCall = Navigator.findMethodCall(main, "printMe").get();
    assertTrue(pmCall != null);
  }
}