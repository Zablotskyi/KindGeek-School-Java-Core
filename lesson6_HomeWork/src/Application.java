import model.*;

import java.util.HashSet;
import java.util.Set;

public class Application {
    Set<Product> productSet;

    public void run(){
        productSet = new HashSet<>();
        Utilities utilities = new Utilities();

        Mat mat = new Mat("Kovryk", 98, "gray", "no");
        Mat matGame = new Mat("KovrykForGame", 30, "black", "no");
        Mouse mouse = new Mouse("Logitech", 350, "white", "yes");
        Mouse mouseGame = new Mouse("Asus", 2300, "black", "yes");
        Keyboard keyboard = new Keyboard("Ergo", 186, "white", "yes");
        Keyboard keyboardGame = new Keyboard("Asus", 1789, "black", "yes");
        DeskTop deskTop = new DeskTop("Brain", 6500, "white");
        DeskTop deskTopGame = new DeskTop("Vinga", 18000, "black");
        LapTop lapTop = new LapTop("Hp", 16000, "gray");
        LapTop lapTopGame = new LapTop("Asus", 48000, "black");

        productSet.add(mat);
        productSet.add(matGame);
        productSet.add(mouse);
        productSet.add(mouseGame);
        productSet.add(keyboard);
        productSet.add(keyboardGame);
        productSet.add(deskTop);
        productSet.add(deskTopGame);
        productSet.add(lapTop);
        productSet.add(lapTopGame);

//        utilities.showColor("black", productSet);
//        utilities.showPluggable("yes", productSet);
//        utilities.showPriceFromAndTo(100, 1000, productSet);
        utilities.showAllCategories("Mat", productSet);
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
