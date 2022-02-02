import exception.MyException;
import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Utilities {
    List<Product> list = new ArrayList<>();
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

    public void showColor(String color, Map<Product, Integer> productMap) throws MyException {
        list.clear();
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getColor().equals(color)) {
                list.add(entry.getKey());
            }
            if (!list.isEmpty()) {
                for (Product product : list) {
                    System.out.println(product);
                }
            } else {
                throw new MyException("There is no product with this color");
            }
        }
    }

    public void showPluggable(String pluggable, Map<Product, Integer> productMap) throws MyException {
        list.clear();
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getPluggable().equals(pluggable)) {
                list.add(entry.getKey());
            }
            if (!list.isEmpty()) {
                for (Product product : list) {
                    System.out.println(product);
                }
            } else {
                throw new MyException("There are no products in this category");
            }
        }
    }

    public void showPriceFromAndTo(int min, int max, Map<Product, Integer> productMap) throws MyException {
        list.clear();
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getPrice() > min && entry.getKey().getPrice() < max) {
                list.add(entry.getKey());
            }
        }
        if (!list.isEmpty()) {
            for (Product product : list) {
                System.out.println(product);
            }
        } else {
            throw new MyException("There is no product in this price range");
        }
    }

    public void showAllCategories(String categories, Map<Product, Integer> productMap) throws MyException {
        list.clear();
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            if (entry.getKey().getGroup().equals(categories)) {
                list.add(entry.getKey());
            }
        }
        if (!list.isEmpty()) {
            for (Product product : list) {
                System.out.println(product);
            }
        } else {
            throw new MyException("Category is empty");
        }
    }
}
