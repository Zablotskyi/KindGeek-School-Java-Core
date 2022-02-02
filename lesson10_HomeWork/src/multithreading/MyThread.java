package multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("MyThread");

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
