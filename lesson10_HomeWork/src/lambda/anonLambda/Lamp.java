package lambda.anonLambda;

public class Lamp  implements ElectricityConsumer {

    public void lampOn() {
        System.out.println("Lamp on, light on");
    }

    @Override
    public void electricityOn() {
        lampOn();
    }
}
