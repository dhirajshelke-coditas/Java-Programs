package Week3Assignments.Assignment6;



import java.util.concurrent.CountDownLatch;

class Runner implements Runnable {
    private final String name;
    private final CountDownLatch latch;
    private final int order;

    public Runner(String name, CountDownLatch latch, int order) {
        this.name = name;
        this.latch = latch;
        this.order = order;
    }

    @Override
    public void run() {
        try {
            while (latch.getCount() > order) {
                Thread.sleep(50);
            }

            System.out.println(name + " started running!");
            Thread.sleep(1000);
            System.out.println(name + " finished running!");

            latch.countDown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class RelayRaceOneLatch {
    public static void main(String[] args) throws InterruptedException {
        int runners = 3;

  
        CountDownLatch latch = new CountDownLatch(runners);

        Thread runner1 = new Thread(new Runner("Runner 1", latch, runners - 1));
        Thread runner2 = new Thread(new Runner("Runner 2", latch, runners - 2));
        Thread runner3 = new Thread(new Runner("Runner 3", latch, runners - 3));

        runner1.start();
        runner2.start();
        runner3.start();

        System.out.println("Race begins!");

      
        latch.countDown();
    }
}