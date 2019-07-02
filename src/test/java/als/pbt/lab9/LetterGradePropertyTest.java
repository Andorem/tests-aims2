package als.pbt.lab9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.Test;
import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class LetterGradePropertyTest extends PropertyTest {
  String path = findPath("src", "LetterGrade.java");

  @Property
  public void percentageAbove92_5AlwaysA(@InRange(min = "92.5", max = "100") double a) {
    assertEquals("double: " + a, "A", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove89_5AlwaysAMinus(@InRange(min = "89.5", max = "92.5") double a) {
    assertEquals("A-", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove86_5AlwaysBPlus(@InRange(min = "86.5", max = "89.5") double a) {
    assertEquals("B+", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove82_5AlwaysB(@InRange(min = "82.5", max = "86.5") double a) {
    assertEquals("B", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove79_5AlwaysBMinus(@InRange(min = "79.5", max = "82.5") double a) {
    assertEquals("B-", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove76_5AlwaysCPlus(@InRange(min = "76.5", max = "79.5") double a) {
    assertEquals("C+", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove72_5AlwaysC(@InRange(min = "72.5", max = "76.5") double a) {
    assertEquals("C", LetterGrade.letterGrade(a));
  }
  @Property
  public void elsePercentageAbove69_5AlwaysCMinus(@InRange(min = "69.5", max = "72.5") double a) {
    assertEquals("C-", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove66_5AlwaysDPlus(@InRange(min = "66.5", max = "69.5") double a) {
    assertEquals("D+", LetterGrade.letterGrade(a));
  }

  @Property
  public void elsePercentageAbove62_5AlwaysD(@InRange(min = "62.5", max = "66.5") double a) {
    assertEquals("D", LetterGrade.letterGrade(a));
  }
  
  @Property
  public void elsePercentageAbove59_5AlwaysDMinus(@InRange(min = "59.5", max = "62.5") double a) {
    assertEquals("D-", LetterGrade.letterGrade(a));
  }

  @Property
  public void percentageBelow59_5AlwaysF(@InRange(max = "59.5") double a) {
    assertEquals("F", LetterGrade.letterGrade(a));
  }

  @Test
    public void mainIsSame() throws FileNotFoundException {
      String expectedMethod = "public static void main(String[] args) { " +
      "Scanner input = new Scanner(System.in); " +
      "System.out.print(\"Enter grade as percentage: \"); " +
      "double percentage = input.nextDouble(); " +
      "System.out.println(\"Letter grade: \" + letterGrade(percentage));" +
      "}";
      
      
      assertTrue(compareMethod(path, expectedMethod, "main"));
    }
}