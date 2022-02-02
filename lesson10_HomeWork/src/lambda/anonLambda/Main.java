package lambda.anonLambda;

import lambda.anonLambda.ElectricityConsumer;
import lambda.anonLambda.Lamp;
import lambda.anonLambda.Radio;
import lambda.anonLambda.Switcher;

public class Main {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.addElectricityConsumer(new Lamp());
        switcher.addElectricityConsumer(new Radio());
        switcher.switchOn();
//
//        class Computer implements ElectricityConsumer {
//
//            public void startGame() {
//                System.out.println("Playing game");
//            }
//
//            @Override
//            public void electricityOn() {
//                startGame();
//            }
//        }
//        switcher.addElectricityConsumer(new Computer());
//        switcher.switchOn();

        //анонімний клас
//        ElectricityConsumer computer = new ElectricityConsumer() {
//            public void startGame() {
//                System.out.println("Playing game");
//            }
//
//            @Override
//            public void electricityOn() {
//                startGame();
//            }
//        };
//
//        switcher.addElectricityConsumer(computer);
//        switcher.switchOn();

        //метод без лямбда
//        switcher.addElectricityConsumer(new ElectricityConsumer() {
//            @Override
//            public void electricityOn() {
//                System.out.println("Playing game");
//            }
//        });
//        switcher.switchOn();

        //той самий метод але як лямбда вираз
        switcher.addElectricityConsumer(() -> System.out.println("Playing game"));
        switcher.switchOn();
    }
}
