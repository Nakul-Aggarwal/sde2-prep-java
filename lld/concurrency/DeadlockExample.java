public class DeadlockExample {
    // TODO: Demonstrate deadlock

    // Pseudo code:
    // - Object lock1 = new Object(), lock2 = new Object();
    // - Thread1: synchronized(lock1) { Thread.sleep(100); synchronized(lock2) { } }
    // - Thread2: synchronized(lock2) { Thread.sleep(100); synchronized(lock1) { } }

    private static Object lock1 = new Object();
    private static Object lock2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}