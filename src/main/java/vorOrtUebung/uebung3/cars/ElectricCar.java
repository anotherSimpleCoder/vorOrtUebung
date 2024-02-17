package vorOrtUebung.uebung3.cars;

import java.io.Serializable;

public class ElectricCar extends Car implements Serializable {
    private int batteryCapacity;

    public ElectricCar(String brand, String model, String color, float maxSpeed, int batteryCapacity) {
        super(brand, model, color, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String brand, String model) {
        super(brand, model, "black", 130.0f);
        this.batteryCapacity = 60;
    }
}
