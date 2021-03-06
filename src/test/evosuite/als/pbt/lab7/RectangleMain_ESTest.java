/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:13:43 GMT 2019
 */

package als.pbt.lab7;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab7.Rectangle;
import als.pbt.lab7.RectangleMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RectangleMain_ESTest extends RectangleMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        RectangleMain.addSomethingToWidthHeight((-1), (Rectangle) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab7.RectangleMain", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle rectangle0 = mock(Rectangle.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(rectangle0).getHeight();
      doReturn(0).when(rectangle0).getWidth();
      RectangleMain.addSomethingToWidthHeight(0, rectangle0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[1];
      RectangleMain.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RectangleMain rectangleMain0 = new RectangleMain();
  }
}
