package pruebasunitarias2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class CalculatorTest {
	
	// Es private porque solo la utilizaremos en esta clase
	private final Calculator calculator = new Calculator();

	@Test
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}

	
	@Test
	void subtraction() {
		assertEquals(2, calculator.subtractNumbers(10, 8));
	}
	
	@Test
	void multiplication() {
		assertEquals(80, calculator.multiplyNumbers(10, 8));
	}
	
	@Test
	void division() {
		assertEquals(2, calculator.divideNumbers(10, 5));
	}
}
