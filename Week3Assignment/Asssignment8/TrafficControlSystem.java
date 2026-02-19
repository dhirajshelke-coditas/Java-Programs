package Week3Assignments.Asssignment8;



import java.util.concurrent.Semaphore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TrafficControlSystem {

    private static final Semaphore tunnelSemaphore = new Semaphore(3);

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            executor.execute(new Car("Car " + i));
        }
        
        executor.shutdown();
        try {
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                System.err.println("Timeout waiting for all cars to finish.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static class Car implements Runnable {
        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(name + " is approaching the tunnel.");
            try {
                tunnelSemaphore.acquire();
                System.out.println(name + " has entered the tunnel. Available permits: " + tunnelSemaphore.availablePermits());
                
                try {
                    TimeUnit.SECONDS.sleep((long) (Math.random() * 2) + 1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println(name + " is exiting the tunnel.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                
                tunnelSemaphore.release();
                System.out.println(name + " has left the tunnel. Available permits: " + tunnelSemaphore.availablePermits());
            }
        }
    }
}