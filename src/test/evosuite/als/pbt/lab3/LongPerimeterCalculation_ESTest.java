/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:20:22 GMT 2019
 */

package als.pbt.lab3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab3.LongPerimeterCalculation;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LongPerimeterCalculation_ESTest extends LongPerimeterCalculation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      SystemInUtil.addInputLine("8");
      String[] stringArray0 = new String[0];
      LongPerimeterCalculation.main(stringArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      SystemInUtil.addInputLine("2");
      String[] stringArray0 = new String[1];
      LongPerimeterCalculation.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        LongPerimeterCalculation.main(stringArray0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      SystemInUtil.addInputLine(".Txpo_pBc9eG,");
      // Undeclared exception!
      try { 
        LongPerimeterCalculation.main(stringArray0);
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
      LongPerimeterCalculation longPerimeterCalculation0 = new LongPerimeterCalculation();
  }
}