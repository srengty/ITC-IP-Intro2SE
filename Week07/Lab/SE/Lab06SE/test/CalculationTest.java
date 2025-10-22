import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculationTest {
    @Test
    public void testFindMax(){
        assert Calculation.findMax(1, 2) == 2;
    }

    @Test
    public void testFindMax2(){
        assertEquals(1, Calculation.findMax(1, 1));
    }
}
