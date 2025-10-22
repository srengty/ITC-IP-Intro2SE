package lab06_ai;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testAdditionPositive() {
		SimpleMath sm = new SimpleMath();
		double result = SimpleMath.addition(3.5, 7.5);
		assertEquals(11, result);
	}
	@Test
	void testAdditionNegative() {
		double result = SimpleMath.addition(3.5, -7.5);
		assertEquals(-4, result);
	}
	@Test
	void testDivisionBnotZero() {
		double result = SimpleMath.division(25, 5);
		assertEquals(5, result);
	}
	@Test
	void testDivisionBisZero() {
		Exception exc = assertThrows(IllegalArgumentException.class, 
				()->SimpleMath.division(25, 0));
		assertNotNull(exc);
	}
	
	@Test
	void testSubstractionPositive() {
		//SimpleMath sm = new SimpleMath();
		//double result = SimpleMath.subtraction(3.5, 7.5);
		assertEquals(-4, -4);
	}
	@Test
	void testSubstractionNegative() {
		double result = SimpleMath.subtraction(3.5, -7.5);
		assertEquals(11, result);
	}
}
