import exception.MyException;
import model.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Application {
    Map<Product, Integer> productMap;

    public void run() throws MyException {
        Map<Product, Integer> productMap = new HashMap<>();
        Utilities utilities = new Utilities();

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

        productMap.put(mousePad, 10);
        productMap.put(mousePadGame, 10);
        productMap.put(mouse, 10);
        productMap.put(mouseGame, 10);
        productMap.put(keyboard, 10);
        productMap.put(keyboardGame, 10);
        productMap.put(deskTop, 10);
        productMap.put(deskTopGame, 10);
        productMap.put(lapTop, 10);
        productMap.put(lapTopGame, 10);

        utilities.showColor("gray", productMap);
        System.out.println("_________________________________________");
        utilities.showPluggable("yes", productMap);
        System.out.println("_________________________________________");
        utilities.showPriceFromAndTo(100, 101, productMap);
        System.out.println("_________________________________________");
        utilities.showAllCategories("Mouse", productMap);
    }

    public Map<Product, Integer> getProductSet() {
        return productMap;
    }
}
