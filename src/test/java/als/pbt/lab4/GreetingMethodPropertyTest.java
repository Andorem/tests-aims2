package als.pbt.lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class GreetingMethodPropertyTest extends PropertyTest {
  String path = findPath("src", "GreetingMethod.java");
  @Test
  public void methodIsSame() throws FileNotFoundException {
    String expectedMethod = "public static void printGreeting() { System.out.println(\"Hello!\"); System.out.println(\"Goodbye...\");}";
    assertTrue(compareMethod(path, expectedMethod, "printGreeting"));
  }
  @Test
  public void printsGreetingTwice() {
    GreetingMethod.main(new String[0]);
    assertEquals("Hello!Goodbye...Hello!Goodbye...", getOutput());
  }
    
}