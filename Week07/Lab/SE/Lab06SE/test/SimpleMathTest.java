import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test @DisplayName("Test add between two positive numbers")
    public void testAddPositive(){
        assertEquals(25, SimpleMath.addition(10, 15));
    }
    @Test
    public void testAddNegative(){
        assertEquals(-5, SimpleMath.addition(10, -15));
    }
    @Test
    public void testDivisionZeroByZero(){
        Exception exc = assertThrows(IllegalArgumentException.class, ()->SimpleMath.division(0,0));
        assertEquals("Infinity", exc.getMessage());
    }
    @Test
    public void testDivisionNonzeroByZero(){
        Exception exc = assertThrows(IllegalArgumentException.class, ()->SimpleMath.division(2,0));
        assertEquals("Cannot divide by zero", exc.getMessage());
    }
    @Test
    public void testDivisionNonzeroByNonzero(){
        assertEquals(5, SimpleMath.division(25,5));
    }
}
