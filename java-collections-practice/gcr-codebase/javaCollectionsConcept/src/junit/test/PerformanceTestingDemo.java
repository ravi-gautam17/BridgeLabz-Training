package junit.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import junit.BasicJunitTesting.performanceTesting.PerformanceTest;

public class PerformanceTestingDemo {
	
	PerformanceTest test = new PerformanceTest();
	
	@Test
	@Timeout(value =2, unit= TimeUnit.SECONDS)
	public void testPerformance() {
		String result = test.longRunningTask();
		
		Assertions.assertEquals("Task Completed", result);
	}
}
