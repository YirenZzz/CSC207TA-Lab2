import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
// place your cursor over junit below and
// click "Add 'Junit4' to classpath" then press OK to be able to run this test.
import static org.junit.Assert.assertEquals;

public class DataTypesTest {

    @Test(timeout = 1000)
    /**
     * Test that DataTypes.sum returns the correct value for
     * the sum from 1 to 1 million.
     */
    public void largeSumTest() {

        // You put an L at the end to indicate it is a long.
        // try removing the L and you'll see that you get an error
        // saying "Integer number too large".
        // Note: You can use _ to help make it easier to
        //       read large numbers, as is done below.
        long x = 500_000_500_000L; // defining data type of x as a long used to represent large numbers
        List<Integer> lst = new ArrayList<>();  // declaring and assigning variable lst to an empty Array
        for (int i = 1; i <= 1_000_000; i++) { // looping through from 1 to 1 million
            lst.add(i);  // adding number to lst

        } // makes a list of numbers from 1 to 1 million
        assertEquals("sum from 1 to 1 million should be " + x, x, DataTypes.sum(lst));
    }

    // why is sum different
}
