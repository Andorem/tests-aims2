/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:20:00 GMT 2019
 */

package als.pbt.lab6;

import org.junit.Test;
import static org.junit.Assert.*;
import als.pbt.lab6.PrintMain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PrintMain_ESTest extends PrintMain_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      PrintMain.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PrintMain printMain0 = new PrintMain();
  }
}
