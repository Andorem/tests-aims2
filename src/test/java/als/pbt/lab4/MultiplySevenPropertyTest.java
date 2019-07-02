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
public class MultiplySevenPropertyTest extends PropertyTest {
  String path = findPath("src", "MultiplySeven.java");

  @Property
  public void intMultipledBySeven(final int a) {
    int res = a * 7;
    assertEquals(res, MultiplySeven.multiplyBy7(a));
  }

  @Property
  public void outputIsCorrect(final int a) {
    setInput(a);
    MultiplySeven.main(new String[0]);
    assertEquals("Enter an integer: Multiplied by 7: " + a * 7, getOutput());
  }

  @Test
  public void methodIsSame() throws FileNotFoundException {
      String expectedMethod = "public static void main(String[] args) { "
        + "Scanner input = new Scanner(System.in); "
        + "System.out.print(\"Enter an integer: \"); "
        + "int i = input.nextInt(); "
        + "System.out.println(\"Multiplied by 7: \" + multiplyBy7(i));"
        + "}";
      assertTrue(compareMethod(path, expectedMethod, "main"));
  }
    
}