import java.util.concurrent.*;

public class ThreadPoolExample {
    // TODO: Demonstrate Thread Pool

    // Pseudo code:
    // - ExecutorService executor = Executors.newFixedThreadPool(5);
    // - for (int i = 0; i < 10; i++) { executor.submit(new Task(i)); }
    // - executor.shutdown();

    static class Task implements Runnable {
        private int taskId;

        public Task(int id) {
            this.taskId = id;
        }

        public void run() {
            System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.submit(new Task(i));
        }
        executor.shutdown();
    }
}