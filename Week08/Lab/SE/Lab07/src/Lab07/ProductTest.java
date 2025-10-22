package Lab07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProductTest {

	@Test @DisplayName("Set name correctly (name is not blank)")
	void setNameCorrectly() {
		Product prod = new Product();
		prod.setName("Grape");
		assertEquals("Grape",prod.getName());		
	}
	
	@Test @DisplayName("Set name incorrectly (name is blank)")
	void setNameIncorrectly() {
		Product prod = new Product();
		prod.setName("   ");
		assertNull(prod.getName());		
	}

}
