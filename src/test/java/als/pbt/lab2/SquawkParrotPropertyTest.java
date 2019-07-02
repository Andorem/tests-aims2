package als.pbt.lab2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import org.junit.runner.RunWith;

import als.pbt.PropertyTest;
import als.pbt.lab2.SquawkParrot;

@RunWith(JUnitQuickcheck.class)
public class SquawkParrotPropertyTest extends PropertyTest {
    @Property
    public void outputIsCorrectFormat(final String input) {
      assumeTrue(input.matches("[^A-Za-z0-9 ]"));
      setInput(input);
      SquawkParrot.main(new String[0]);
      assertEquals("Enter something to repeat: BRAAWK " + input + "!", getOutput());
    }
    
}