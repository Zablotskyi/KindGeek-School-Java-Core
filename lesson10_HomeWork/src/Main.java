import exception.MyException;

public class Main {
    public static void main(String[] args) throws MyException {
        Application application = new Application();
        Thread myThread = new Thread();

        try {
            application.start();
            Thread.currentThread().join(4000);
            System.out.println(Thread.currentThread().getName() + " finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
