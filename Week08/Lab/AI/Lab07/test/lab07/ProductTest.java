package lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test @DisplayName("Set name correctly (name is not blank)")
	void testNameNotBlank() {
		Product product = new Product();
		product.setName("Grape");
		assertEquals("Grape",product.getName());
	}
	@Test @DisplayName("Set name incorrectly (name is blank)")
	void testNameBlank() {
		Product product = new Product();
		product.setName("                        ");
		assertNull(product.getName());
	}

}
