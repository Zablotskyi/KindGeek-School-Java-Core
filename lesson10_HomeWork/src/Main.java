import exception.MyException;

public class Main {
    public static void main(String[] args) throws MyException {
        Application application = new Application();
        Thread myThread = new Thread();

        myThread.start();
        application.run();
    }
}
