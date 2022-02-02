import model.Box;
import model.MyLIst;

public class Main {

    public static void main(String[] args) {
//        Box<String> box = new Box<String>("qwerty");
//        box.setObj("1234");
//        Box<Integer> integerBox = new Box<>(55);
//        integerBox.getObj();
        MyLIst<Integer> myLIst = new MyLIst<>();
        myLIst.add(1);
        myLIst.add(2);
        myLIst.add(3);
        myLIst.add(4);
        myLIst.add(5);
        myLIst.add(6);
        myLIst.add(7);
        myLIst.add(8);
        myLIst.add(9);
        myLIst.add(10);

        myLIst.add(11);
        myLIst.add(12);

        System.out.println(myLIst);
    }
}
