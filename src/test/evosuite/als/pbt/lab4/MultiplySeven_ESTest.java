/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:16:56 GMT 2019
 */

package als.pbt.lab4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab4.MultiplySeven;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiplySeven_ESTest extends MultiplySeven_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("1");
      String[] stringArray0 = new String[4];
      MultiplySeven.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = MultiplySeven.multiplyBy7(183);
      assertEquals(1281, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = MultiplySeven.multiplyBy7((-8));
      assertEquals((-56), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SystemInUtil.addInputLine("[:k3C7R2-D*P'CBf");
      // Undeclared exception!
      try { 
        MultiplySeven.main(stringArray0);
        fail("Expecting exception: InputMismatchException");
      
      } catch(InputMismatchException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = MultiplySeven.multiplyBy7(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        MultiplySeven.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MultiplySeven multiplySeven0 = new MultiplySeven();
  }
}
