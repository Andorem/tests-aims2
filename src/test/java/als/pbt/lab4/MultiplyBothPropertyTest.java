package als.pbt.lab4;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class MultiplyBothPropertyTest extends PropertyTest {
  String path = findPath("src", "MultiplyBoth.java");

  @Property
  public void intsMultipledTogether(final int a, final int b) {
    int res = a * b;
    assertEquals(res, MultiplyBoth.multiplyBoth(a, b));
  }

  @Property
  public void outputIsCorrect(final int a, final int b) {
    setInput(a + NL + b);
    MultiplyBoth.main(new String[0]);
    assertEquals("Enter an integer: Enter a second integer: Result: " + a * b, getOutput());
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
      String expectedMethod = "public static void main(String[] args) { "
        + "Scanner input = new Scanner(System.in); "
        + "System.out.print(\"Enter an integer: \"); "
        + "int first = input.nextInt(); "
        + "System.out.print(\"Enter a second integer: \"); "
        + "int second = input.nextInt(); "
        + "System.out.println(\"Result: \" + multiplyBoth(first, second));"
        + "}";
      MethodDeclaration method = getMethod(path, "main");
      String actualMethod = method.getDeclarationAsString() + " " + method.getBody().get().toString();
      assertEquals(expectedMethod, strip(actualMethod));

  }
    
}