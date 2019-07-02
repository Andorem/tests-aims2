/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 04:54:39 GMT 2019
 */

package als.pbt.lab14;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import als.pbt.lab14.SumMinMaxArgs;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SumMinMaxArgs_ESTest extends SumMinMaxArgs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[11];
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(11, intArray0.length);
      
      int int0 = sumMinMaxArgs0.sum();
      assertEquals(11, intArray0.length);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1590;
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(2, intArray0.length);
      assertArrayEquals(new int[] {1590, 0}, intArray0);
      
      int int0 = sumMinMaxArgs0.sum();
      assertEquals(2, intArray0.length);
      assertEquals(1590, int0);
      assertArrayEquals(new int[] {1590, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-1);
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {(-1)}, intArray0);
      
      int int0 = sumMinMaxArgs0.sum();
      assertEquals(1, intArray0.length);
      assertEquals((-1), int0);
      assertArrayEquals(new int[] {(-1)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      int[] intArray0 = SumMinMaxArgs.parseStrings(stringArray0);
      assertNotNull(intArray0);
      assertEquals(0, stringArray0.length);
      assertEquals(0, intArray0.length);
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[0] = 1063;
      intArray0[1] = 1;
      intArray0[2] = 306;
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(3, intArray0.length);
      assertArrayEquals(new int[] {1063, 1, 306}, intArray0);
      
      int int0 = sumMinMaxArgs0.min();
      assertEquals(3, intArray0.length);
      assertEquals(1, int0);
      assertArrayEquals(new int[] {1063, 1, 306}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = (-509);
      intArray0[1] = (-192);
      intArray0[2] = (-1);
      intArray0[3] = (-2128);
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {(-509), (-192), (-1), (-2128)}, intArray0);
      
      int int0 = sumMinMaxArgs0.max();
      assertEquals(4, intArray0.length);
      assertEquals((-1), int0);
      assertArrayEquals(new int[] {(-509), (-192), (-1), (-2128)}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs((int[]) null);
      assertNotNull(sumMinMaxArgs0);
      
      // Undeclared exception!
      try { 
        sumMinMaxArgs0.sum();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        SumMinMaxArgs.parseStrings(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        SumMinMaxArgs.parseStrings((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs((int[]) null);
      assertNotNull(sumMinMaxArgs0);
      
      // Undeclared exception!
      try { 
        sumMinMaxArgs0.min();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(0, intArray0.length);
      assertArrayEquals(new int[] {}, intArray0);
      
      // Undeclared exception!
      try { 
        sumMinMaxArgs0.min();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs((int[]) null);
      assertNotNull(sumMinMaxArgs0);
      
      // Undeclared exception!
      try { 
        sumMinMaxArgs0.max();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[0];
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(0, intArray0.length);
      assertArrayEquals(new int[] {}, intArray0);
      
      // Undeclared exception!
      try { 
        sumMinMaxArgs0.max();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        SumMinMaxArgs.main(stringArray0);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // null
         //
         verifyException("java.lang.Integer", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        SumMinMaxArgs.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        SumMinMaxArgs.main(stringArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("als.pbt.lab14.SumMinMaxArgs", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "5";
      int[] intArray0 = SumMinMaxArgs.parseStrings(stringArray0);
      assertNotNull(intArray0);
      assertEquals(1, stringArray0.length);
      assertEquals(1, intArray0.length);
      assertArrayEquals(new int[] {5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[10];
      intArray0[7] = 351;
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(10, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 351, 0, 0}, intArray0);
      
      int int0 = sumMinMaxArgs0.max();
      assertEquals(10, intArray0.length);
      assertEquals(351, int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 351, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int[] intArray0 = new int[10];
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      assertNotNull(sumMinMaxArgs0);
      assertEquals(10, intArray0.length);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
      
      int int0 = sumMinMaxArgs0.max();
      assertEquals(10, intArray0.length);
      assertEquals(0, int0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int[] intArray0 = new int[13];
      intArray0[10] = (-918);
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      int int0 = sumMinMaxArgs0.min();
      assertEquals((-918), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int[] intArray0 = new int[13];
      SumMinMaxArgs sumMinMaxArgs0 = new SumMinMaxArgs(intArray0);
      int int0 = sumMinMaxArgs0.min();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "2";
      SumMinMaxArgs.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}