package test.java.com.qaa.module3.unit_testing_exercises.exercise2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.com.qaa.module3.unit_testing_exercises.exercise2.UserService;

class UserServiceTest {

	UserService userService;
	
	@BeforeEach
	void setUp() throws Exception {
		userService = new UserService();
	}

	@AfterEach
	void tearDown() throws Exception {
		userService = null;
	}

	@Test
	void testRegisterUserNameNull() {
		IllegalArgumentException iae = Assertions.assertThrows(IllegalArgumentException.class, () -> {
		      // code that could throw an exception
			userService.register(null, "A1n2BB");
		    }, "IllegalArgumentException was expected");

		    Assertions.assertEquals("Username must not be null", iae.getMessage());
		
	}

	@Test
	void testLogin() {
		fail("Not yet implemented");
	}

}
