package dk.dtu.se2.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import dk.dtu.se2.configuration.action.StartTest;

public class RunTests {
	
	public static void start() {
		Result result = JUnitCore.runClasses(StartTest.class);
		System.out.println(result.getRunCount());
		for (Failure failure : result.getFailures()) {
			System.out.println("Failure: " + failure);
		}
	}

}
