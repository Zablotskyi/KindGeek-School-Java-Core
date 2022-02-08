import exception.MyException;
import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application extends Thread {
    private List<Product> productList = new ArrayList<>();

    @Override
    public void run() {
        Thread.currentThread().setName("Application Thread");
        MousePad mousePad = new MousePad("MousePad", 98, "gray", "MousePad", "no");
        MousePad mousePadGame = new MousePad("MousePadForGame", 30, "black", "MousePad", "no");
        Mouse mouse = new Mouse("Logitech", 350, "white", "Mouse", "yes");
        Mouse mouseGame = new Mouse("Asus", 2300, "black", "Mouse", "yes");
        Keyboard keyboard = new Keyboard("Ergo", 186, "white", "Keyboard", "yes");
        Keyboard keyboardGame = new Keyboard("Asus", 1789, "black", "Keyboard", "yes");
        DeskTop deskTop = new DeskTop("Brain", 6500, "white", "DeskTop", "no");
        DeskTop deskTopGame = new DeskTop("Vinga", 18000, "black", "DeskTop", "no");
        LapTop lapTop = new LapTop("Hp", 16000, "gray", "LapTop", "no");
        LapTop lapTopGame = new LapTop("Asus", 48000, "black", "LapTop", "no");

        productList.add(mousePad);
        productList.add(mousePadGame);
        productList.add(mouse);
        productList.add(mouseGame);
        productList.add(keyboard);
        productList.add(keyboardGame);
        productList.add(deskTop);
        productList.add(deskTopGame);
        productList.add(lapTop);
        productList.add(lapTopGame);

        try {
            showColor("gray");
            System.out.println("_________________________________________");
            Thread.sleep(1000);
            showPluggable("yes");
            System.out.println("_________________________________________");
            Thread.sleep(1000);
            showPriceFromAndTo(100, 1000);
            System.out.println("_________________________________________");
            Thread.sleep(1000);
            showAllCategories("Mouse");
            System.out.println("_________________________________________");
            Thread.sleep(1000);
            sortedAscPrice();
            System.out.println("_________________________________________");
            Thread.sleep(1000);
            sortedDescPrice();
            System.out.println("\n" + Thread.currentThread().getName() + " finished");
        } catch (MyException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sortedAscPrice() {
        try {
            productList.stream()
                    .sorted(Comparator.comparing(Product::getPrice))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sortedDescPrice() {
        try {
            productList.stream()
                    .sorted(Comparator.comparing(Product::getPrice).reversed())
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showColor(String color) throws MyException {
        try {
            productList.stream()
                    .filter(p -> p.getColor().equals(color))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("There is no product with this color");
        }
    }

    public void showPluggable(String pluggable) throws MyException {
        try {
            productList.stream()
                    .filter(p -> p.getPluggable().equals(pluggable))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("There are no products in this category");
        }

    }

    public void showPriceFromAndTo(int min, int max) throws MyException {
        try {
            productList.stream()
                    .filter(p -> p.getPrice() >= min && p.getPrice() <= max)
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("There is no product in this price range");
        }
    }

    public void showAllCategories(String categories) throws MyException {
        try {
            productList.stream()
                    .filter(p -> p.getGroup().equals(categories))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
            throw new MyException("Category is empty");
        }
    }
}
