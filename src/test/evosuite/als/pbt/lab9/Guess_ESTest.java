/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:08:55 GMT 2019
 */

package als.pbt.lab9;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab9.Guess;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Guess_ESTest extends Guess_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("8");
      String[] stringArray0 = new String[4];
      Guess.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Random.setNextRandom((-2006));
      int int0 = Guess.makeRandomIntBetween0And2Inclusive((-1L));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("Guess was incorrect.  The correct guess was: 0");
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        Guess.main(stringArray0);
        fail("Expecting exception: InputMismatchException");
      
      } catch(InputMismatchException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Guess.makeRandomIntBetween0And2Inclusive(0L);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Guess.isGuessCorrect((-1), (-1));
      assertEquals("Guess was incorrect.  The correct guess was: 0", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        Guess.main(stringArray0);
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
      String string0 = Guess.isGuessCorrect(0, 0);
      assertEquals("Guess is correct!", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Guess guess0 = new Guess();
  }
}
