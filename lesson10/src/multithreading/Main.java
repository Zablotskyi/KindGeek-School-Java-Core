package multithreading;

public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myRunnable = new Thread(new MyRunnable());
        myThread.start();
        myRunnable.start();

        new Thread(() -> {
            Thread.currentThread().setName("LambdaThread");

            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

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
