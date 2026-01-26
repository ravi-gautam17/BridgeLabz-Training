package junit.BasicJunitTesting.performanceTesting;

public class PerformanceTest {
	public String longRunningTask() {
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return "Task completed";
	}
}
