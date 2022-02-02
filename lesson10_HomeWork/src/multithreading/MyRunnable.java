package multithreading;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Thread.currentThread().setName("MyRunnable");

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
