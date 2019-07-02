package als.pbt.lab7;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class RectangleMainPropertyTest extends PropertyTest {
  String path = findPath("src", "RectangleMain.java");

  @Property 
  public void testAddSomething(@From(RectangleGenerator.class) Rectangle r, final int a) {
    int w = r.getWidth();
    int h = r.getHeight();
    RectangleMain.addSomethingToWidthHeight(a, r);
    assertEquals(a + w, r.getWidth());
    assertEquals(a + h, r.getHeight());
  }

  @Test
  public void mainIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void main(String[] args) { " +
    "Rectangle r1 = new Rectangle(3, 4); " +
    "Rectangle r2 = new Rectangle(5, 6); " +
    "System.out.println(\"BEFORE:\"); " +
    "System.out.println(\"R1: \" + r1); " +
    "System.out.println(\"R2: \" + r2); " +
    "addSomethingToWidthHeight(5, r1); " +
    "addSomethingToWidthHeight(4, r2); " +
    "System.out.println(\"\\nAFTER:\"); " +
    "System.out.println(\"R1: \" + r1); " +
    "System.out.println(\"R2: \" + r2);" +
    "}";
    assertTrue(compareMethod(path, expectedMethod, "main"));
  }
}