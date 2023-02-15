package mx.qbits.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    @Test
    public void testConcatenate() {
        Calc calc = new Calc();
        int result = calc.suma(3, 5);
        assertEquals(8, result);
    }
}
