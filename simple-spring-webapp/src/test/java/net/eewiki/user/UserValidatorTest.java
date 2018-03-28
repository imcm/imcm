package net.eewiki.user;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserValidatorTest {

	@Test
	public void testadd() {
		UserValidator object = new UserValidator();
		//fail("Not yet implemented");
		int x = object.add(1, 2);
		assertTrue(x == 3);
	}

}
