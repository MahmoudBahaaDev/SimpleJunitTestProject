package com.unit.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	// used to run the test suite using command line .
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestMultiply.class, TestAdd.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
