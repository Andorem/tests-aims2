package als.pbt.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class ModPropertyTest extends PropertyTest {
  String path = findPath("src", "Mod.java");

 @Property
 public void modDifferent(final int a, final int b) {
   assertEquals(a % b, Mod.modBoth(a, b));
 }

 @Property
 public void modSameIsZero(final int a) {
   assertEquals(0, Mod.modBoth(a, a));
 } 

 @Property
  public void outputIsCorrect(final int a, final int b) {
    assumeTrue(a > 0 && b > 0);
    setInput(a + NL + b);
    Mod.main(new String[0]);
    String expectedOutput = "Enter an integer: Enter a second integer: Result: " + a % b;
    assertEquals(expectedOutput, getOutput());
  }

 @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Scanner input = new Scanner(System.in); " +
    "System.out.print(\"Enter an integer: \"); " +
    "int first = input.nextInt(); " +
    "System.out.print(\"Enter a second integer: \"); " +
    "int second = input.nextInt(); " +
    "System.out.println(\"Result: \" + modBoth(first, second));" +
    "}";
    
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}