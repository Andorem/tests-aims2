/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:16:22 GMT 2019
 */

package als.pbt.lab4;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab4.ConcatenateStringInt;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConcatenateStringInt_ESTest extends ConcatenateStringInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("10");
      String[] stringArray0 = new String[6];
      ConcatenateStringInt.main(stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("");
      SystemInUtil.addInputLine("]KEP9f:5g&MEQkg");
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        ConcatenateStringInt.main(stringArray0);
        fail("Expecting exception: InputMismatchException");
      
      } catch(InputMismatchException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConcatenateStringInt concatenateStringInt0 = new ConcatenateStringInt();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = ConcatenateStringInt.concatenate("", 10);
      assertEquals("10", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        ConcatenateStringInt.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }
}