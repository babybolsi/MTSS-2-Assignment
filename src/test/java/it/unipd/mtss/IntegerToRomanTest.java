////////////////////////////////////////////////////////////////////
// FRANCESCO BASSANI 2042375
// IRENE CIRIOLO 2043682
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test
    public void testZeroNumber() throws NumeriNegativiException, BigNumberException {
        int number = 0;
        String expected = "";
        String roman_number = converter.convert(number);
        assertEquals(expected, roman_number);
    }

    @Test(expected = NumeriNegativiException.class)
    public void testNegativeNumber() throws NumeriNegativiException, BigNumberException {
        int number = -1;
        converter.convert(number);
    }

    @Test(expected = BigNumberException.class)
    public void testTooBigNumber() throws NumeriNegativiException, BigNumberException {
        int number = 1001;
        converter.convert(number);
    }
}