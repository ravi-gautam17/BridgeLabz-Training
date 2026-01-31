package functionalinterfaces.backgroundjobexecution;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable task representing a background job
        Runnable backgroundTask = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(3000); // Simulating time-consuming task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job completed.");
        };

        // Running the task asynchronously using a Thread
        Thread backgroundThread = new Thread(backgroundTask);
        backgroundThread.start();

        System.out.println("Main thread continues execution...");
    }
}
