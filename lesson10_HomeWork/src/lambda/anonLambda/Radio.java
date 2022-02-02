package lambda.anonLambda;

public class Radio implements ElectricityConsumer {

    public void radioOn() {
        System.out.println("Radio play music");
    }

    @Override
    public void electricityOn() {
        radioOn();
    }
}
