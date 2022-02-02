package lambda.anonLambda;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private final List<ElectricityConsumer> electricityConsumers = new ArrayList<>();

    public void switchOn() {
        System.out.println("Electricity ON----------------------------------------");
        for (ElectricityConsumer electricityConsumer : electricityConsumers) {
            electricityConsumer.electricityOn();
        }
    }

    public void addElectricityConsumer(ElectricityConsumer electricityConsumer) {
        electricityConsumers.add(electricityConsumer);
    }
}
