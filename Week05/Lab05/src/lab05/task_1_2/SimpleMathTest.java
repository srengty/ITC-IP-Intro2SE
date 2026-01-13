package lab05.task_1_2;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleMathTest {
    @Test
    @Tag("add")
    public void test_add_positive_numbers(){
        // will test on add() method
        SimpleMath math = new SimpleMath();
        assertEquals(5, math.add(2,3),0);
    }
    @Test
    @Tag("add")
    public void test_add_negative_numbers(){
        SimpleMath math = new SimpleMath();
        assertTrue(-5==math.add(-2,-3));
    }
    @Test()
    public void test_divide_with_a_0(){
        SimpleMath math = new SimpleMath();
        Exception exc = assertThrows(RuntimeException.class, 
            ()->math.divide(5, 0));
        assertEquals("Divide by zero", exc.getMessage());
    }
    @Test
    public void test_divide_with_0_0(){
        SimpleMath math = new SimpleMath();
        Exception exc = assertThrows(RuntimeException.class, 
            ()->math.divide(0, 0));
        assertEquals("Infinite possibilities", exc.getMessage());
    }
}
