/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 02 05:17:48 GMT 2019
 */

package als.pbt.lab7;

import org.junit.Test;
import static org.junit.Assert.*;
import als.pbt.lab7.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Rectangle_ESTest extends Rectangle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0);
      int int0 = rectangle0.getWidth();
      assertEquals(0, int0);
      assertEquals(0, rectangle0.getHeight());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1905, 1905);
      int int0 = rectangle0.getWidth();
      assertEquals(7620, rectangle0.getPerimeter());
      assertEquals(1905, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(0, 0);
      int int0 = rectangle0.getPerimeter();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 0);
      int int0 = rectangle0.getPerimeter();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 0);
      int int0 = rectangle0.getHeight();
      assertEquals(2, rectangle0.getPerimeter());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1068, 1068);
      int int0 = rectangle0.getHeight();
      assertEquals(1068, int0);
      assertEquals(1068, rectangle0.getWidth());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-24), (-24));
      rectangle0.setWidth((-24));
      assertEquals((-96), rectangle0.getPerimeter());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(1, 0);
      String string0 = rectangle0.toString();
      assertEquals("Rectangle(1, 0)", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-2809), (-2809));
      int int0 = rectangle0.getWidth();
      assertEquals((-11236), rectangle0.getPerimeter());
      assertEquals((-2809), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-24), (-24));
      int int0 = rectangle0.getHeight();
      assertEquals((-24), int0);
      assertEquals((-24), rectangle0.getWidth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-24), (-24));
      rectangle0.setHeight((-24));
      assertEquals((-96), rectangle0.getPerimeter());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle((-24), (-24));
      int int0 = rectangle0.getPerimeter();
      assertEquals((-96), int0);
  }
}