/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:15:28 GMT 2019
 */

package als.pbt.lab6;

import org.junit.Test;
import static org.junit.Assert.*;
import als.pbt.lab6.PrintString;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintString_ESTest extends PrintString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      PrintString.main(stringArray0);
      assertEquals(7, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintString printString0 = new PrintString();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PrintString.printString("");
  }
}
