package als.pbt.lab10;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.symbolsolver.javaparser.Navigator;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class InRangePropertyTest extends PropertyTest {
  String path = findPath("src", "InRange.java");
  MethodDeclaration or = getMethod(path, "outOfRange");

  InRange create(int a, int b) {
    return new InRange(Math.min(a, b), Math.max(a, b));
  }

 @Property
 public void boundariesAlwaysInRange(int a, int b) {
   InRange ir = create(a, b); 
   assertTrue(ir.inRange(a) && ir.inRange(b));
 }

@Property
public void inRangeValuesAreTrue(int a, int b) {
  InRange ir = create(a, b);
  int lowerVal = Math.min(a, b) + 1;
  int upperVal = Math.max(a, b) - 1;
  assertTrue(ir.inRange(lowerVal));
  assertTrue(ir.inRange(upperVal));
}

@Property
public void onlySelfInRangeOfSelf(int a) {
  InRange ir = create(a, a);
  assertTrue(ir.inRange(a));
  assertTrue(ir.outOfRange(a + 1));
}

@Property
public void valuesGreaterThanMaxAlwaysOutOfRange(int a, int b) {
  InRange ir = create(a, b);
  assertTrue(ir.outOfRange(Math.max(a, b) + 1));
}

 @Property
 public void outOfRangeOppositeInRange(@From(InRangeGenerator.class) InRange a, int num) {
   assertTrue(a.outOfRange(num) == !a.inRange(num));
 }

 @Test
 public void outOfRangeCallsInRange() {

   MethodCallExpr irCall = Navigator.findMethodCall(or, "inRange").get();
   assertTrue(irCall != null);
 }

 @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner input = new Scanner(System.in); " +
    "System.out.print(\"Low end of range: \"); " +
    "int min = input.nextInt(); " +
    "System.out.print(\"High end of range: \"); " +
    "int max = input.nextInt(); " +
    "System.out.print(\"Number: \"); " +
    "int num = input.nextInt(); " +
    "InRange range = new InRange(min, max); " +
    "System.out.println(\"In range: \" + range.inRange(num)); " +
    "System.out.println(\"Out of range: \" + range.outOfRange(num));" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}