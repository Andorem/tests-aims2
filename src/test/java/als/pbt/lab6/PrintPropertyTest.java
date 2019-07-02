package als.pbt.lab6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.symbolsolver.javaparser.Navigator;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class PrintPropertyTest extends PropertyTest {
  String path = findPath("src", "PrintInt.java");

  @Property
  public void printsInt(final int input) {
    PrintInt.printInt(input);
    assertEquals(String.valueOf(input), getOutput());
  }

  @Property
  public void printsString(final String input) {
    PrintString.printString(input);
    assertEquals(strip(input), getOutput());
  }

  @Property
  public void outputIsCorrect(String[] s) {
    PrintMain.main(s);
    assertEquals("bar98", getOutput());
  }

  @Test
  public void printsWithMethods() {
    MethodDeclaration main = getMethod(findPath("src", "PrintMain.java"), "main");

    MethodCallExpr call1 = Navigator.findMethodCall(main, "printString").get();
    MethodCallExpr call2 = Navigator.findMethodCall(main, "printInt").get();
    assertTrue(call1 != null && call2 != null);
  }

  @Test
  public void printStringMainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " + "printString(\"foo\");" + "}";

    assertTrue(compareMethod(findPath("src", "PrintString.java"), expectedMethod, "main"));
  }

  @Test
  public void printIntMainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " + "printInt(57);" + "}";

    assertTrue(compareMethod(findPath("src", "PrintInt.java"), expectedMethod, "main"));
  }
}