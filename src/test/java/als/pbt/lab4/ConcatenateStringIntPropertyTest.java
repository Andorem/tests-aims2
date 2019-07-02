package als.pbt.lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class ConcatenateStringIntPropertyTest extends PropertyTest {
  String path = findPath("src", "ConcatenateStringInt.java");


  @Property
  public void concatenatedTogether(final String a, final int b) {
    assertEquals(a + b, ConcatenateStringInt.concatenate(a, b));
  }

  @Property
  public void outputIsCorrect(final String a, final int b) {
    setInput(a + NL + b);
    ConcatenateStringInt.main(new String[0]);
    assertEquals("Enter string: Enter integer: Concatenated: " + (a + b), getOutput());
  
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
      String expectedMethod = "public static void main(String[] args) { "
        + "Scanner input = new Scanner(System.in); "
        + "System.out.print(\"Enter string: \"); "
        + "String myString = input.nextLine(); "
        + "System.out.print(\"Enter integer: \"); "
        + "int myInteger = input.nextInt(); "
        + "System.out.println(\"Concatenated: \" + "
        +  "concatenate(myString, myInteger));"
        + "}";
        assertTrue(compareMethod(path, expectedMethod, "main"));
  }

    
}