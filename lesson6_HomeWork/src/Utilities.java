import model.Accessories;
import model.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utilities {
    Application application = new Application();
    Accessories accessories;
    List<Product> list;

//    public List<Product> sortedAscPrice(Set<Product> productSet) {
//        list = List.copyOf(productSet);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getPrice() > list.get(i + 1).getPrice()) {
//                list
//            }
//        }
//        return list;
//    }
//
//    public List<Product> sortedDescPrice() {
//
//        return list;
//    }

//    public List<Product> showColor(String color) {
//        for(Product product : application.getProductSet()) {
//            if (product.getColor().equals(color))
//            list.add(product);
//        }
//        return list;
//    }

    public void showColor(String color, Set<Product> set) {
        list = new ArrayList<>();
        for(Product product : set) {
            if (product.getColor().equals(color))
                list.add(product);
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showPluggable(String pluggable, Set<Product> set) {
        list = new ArrayList<>();
        for(Product product : set) {
            if (accessories.getPluggable().equals(pluggable))
            list.add(product);
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showPriceFromAndTo(int min, int max, Set<Product> set) {
        list = new ArrayList<>();
        for(Product product : set) {
            if (product.getPrice() > min && product.getPrice() < max)
                list.add(product);
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }

    public void showAllCategories(String categories, Set<Product> set) {
        list = new ArrayList<>();
        for(Product product : set) {
            if (product.getClass().equals(categories))
                list.add(product);
        }
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
