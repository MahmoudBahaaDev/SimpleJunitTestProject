package com.unit.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void test() {
		TestLogic myTest = new TestLogic();
		int result = myTest.multiply(0, 5);
		assertEquals(" the 0 * 5 must be 0 ", 0 , result);
	}

}
