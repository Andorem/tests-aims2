/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:04:43 GMT 2019
 */

package als.pbt.lab12;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab12.ProductUpTo3;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ProductUpTo3_ESTest extends ProductUpTo3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("2");
      SystemInUtil.addInputLine("2");
      SystemInUtil.addInputLine("2");
      ProductUpTo3.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("2");
      SystemInUtil.addInputLine("2");
      // Undeclared exception!
      try { 
        ProductUpTo3.main((String[]) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ProductUpTo3.productUpToFirst3((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab12.ProductUpTo3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[3];
      SystemInUtil.addInputLine("x>;D.dV;w(");
      // Undeclared exception!
      try { 
        ProductUpTo3.main(stringArray0);
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
      int[] intArray0 = new int[29];
      int int0 = ProductUpTo3.productUpToFirst3(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      int int0 = ProductUpTo3.productUpToFirst3(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ProductUpTo3 productUpTo3_0 = new ProductUpTo3();
  }
}
