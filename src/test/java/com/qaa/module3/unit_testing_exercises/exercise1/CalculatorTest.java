package test.java.com.qaa.module3.unit_testing_exercises.exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.qaa.module3.unit_testing_exercises.exercise1.Calculator;

class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	void setUp() throws Exception {
		// Arrange
		calculator = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator = null;
	}

	@Test
	void testAddSmall() {
		
		Assertions.assertEquals(40, calculator.add(30, 10));
	}
	
	@Test
	void testAddTwoMax() {
		
		Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.add(Double.MAX_VALUE, Double.MAX_VALUE));
	}

	@Test
	void testSubtract() {
		fail("Not yet implemented");
	}

	@Test
	void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	void testDivideByZero() {
		
		IllegalArgumentException iae = Assertions.assertThrows(IllegalArgumentException.class, () -> {
		      // code that could throw an exception
			calculator.divide(10, 0);
		    }, "IllegalArgumentException was expected");

		    Assertions.assertEquals("Division by zero: divisor must not be 0", iae.getMessage());

	}
}
