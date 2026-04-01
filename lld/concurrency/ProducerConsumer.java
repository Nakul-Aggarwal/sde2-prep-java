import java.util.concurrent.*;

public class ProducerConsumer {
    // TODO: Implement Producer Consumer using BlockingQueue

    // Pseudo code:
    // - BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
    // - Producer: while true { queue.put(produce()); }
    // - Consumer: while true { consume(queue.take()); }

    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

    class Producer implements Runnable {
        public void run() {
            try {
                while (true) {
                    int item = produce();
                    queue.put(item);
                    System.out.println("Produced: " + item);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private int produce() {
            return (int) (Math.random() * 100);
        }
    }

    class Consumer implements Runnable {
        public void run() {
            try {
                while (true) {
                    int item = queue.take();
                    consume(item);
                    System.out.println("Consumed: " + item);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        private void consume(int item) {
            // process item
        }
    }

    // TODO: Start producer and consumer threads
}