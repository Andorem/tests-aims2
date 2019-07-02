package als.pbt.lab7;

import static org.junit.Assert.assertEquals;

import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.PropertyTest;

@RunWith(JUnitQuickcheck.class)
public class RectanglePropertyTest extends PropertyTest {
  String path = findPath("src", "Rectangle.java");

  @Property
  public void rectangleToString(final int w, final int h) {
    Rectangle r = new Rectangle(w, h);
    assertEquals("Rectangle(" + w + ", " + h + ")", r.toString());
  }

  @Property
  public void rectangleGets(final int w, final int h) {
    Rectangle r = new Rectangle(w, h);
    assertEquals(w, r.getWidth());
    assertEquals(h, r.getHeight());
    assertEquals(2 * w + 2 * h, r.getPerimeter());
  }

  @Property
  public void rectangleSets(@From(RectangleGenerator.class) final Rectangle r, int w, int h) {
    r.setWidth(w);
    r.setHeight(h);
    assertEquals(w, r.getWidth());
    assertEquals(h, r.getHeight());
  }
}