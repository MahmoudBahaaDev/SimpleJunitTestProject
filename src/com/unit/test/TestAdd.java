package com.unit.test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestAdd {

	@Test
	public void test() {
		TestLogic testLogic = new TestLogic();
		int result = testLogic.testAdd(1, 2);
		assertEquals("the 1+2 must be 3 ", 3, result);
	}
}
