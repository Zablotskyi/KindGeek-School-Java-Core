import model.Client;
import model.Employee;
import model.Product;

public class Application {
    Client client = new Client("Vasyl", 1000, "MONO");
    Employee employee = new Employee("Oksana", 1000, "MONO");

    public void run() {
        client.createClient();
        client.getBalance();
        client.puy(1000);
        System.out.println("balance Client after salary: ");
        client.showBalanceAfterSalary();
        client.buy(Product.HOBBY, 150);
        System.out.println("balance Client after purchase: ");
        client.showBalanceAfterPurchase();

        employee.createEmployee();
        employee.getBalance();
        employee.puy(1000);
        System.out.println("balance Employee after salary: ");
        employee.showBalanceAfterSalary();
        employee.buy(Product.HOBBY, 50);
        System.out.println("balance Employee after purchase: ");
        employee.showBalanceAfterPurchase();
    }
}
