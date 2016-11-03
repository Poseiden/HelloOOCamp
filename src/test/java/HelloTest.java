import org.junit.Test;
import sun.tools.jconsole.Plotter;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by hbzhu on 01/11/2016.
 */
public class HelloTest {


    @Test
    public void should_return_true_when_lengthA_equals_lengthB_with_same_unit() {
        Length length = new Length(1, Units.METER);
        Length length1  = new Length(1, Units.METER);

        boolean flag = length.compare(length1);

        assertTrue(flag);
    }

    @Test
    public void should_return_false_when_lengthA_more_than_lengthB_with_same_unit() {
        Length length = new Length(1, Units.METER);
        Length length1 = new Length(2, Units.METER);

        boolean flag = length.compare(length1);

        assertFalse(flag);
    }

    @Test
    public void should_return_true_when_lengthA_not_equals_lengthB_with_different_unit() throws Exception {
        Length length = new Length(1, Units.METER);
        Length length1 = new Length(100, Units.CM);

        boolean flag = length.compare(length1);

        assertTrue(flag);
    }

    @Test
    public void should_return_false_when_lengthA_not_equals_lengthB_with_different_unit() throws Exception {
        Length length = new Length(1, Units.METER);
        Length length1 = new Length(2, Units.CM);

        boolean flag = length.compare(length1);

        assertFalse(flag);
    }
}
