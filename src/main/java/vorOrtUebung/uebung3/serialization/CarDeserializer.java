package vorOrtUebung.uebung3.serialization;

import vorOrtUebung.uebung3.cars.Car;

import java.io.*;

public class CarDeserializer {
    public static Car deSerializeCar(String filename) {
        Car c = null;

        try (FileInputStream fis = new FileInputStream(filename); ObjectInputStream ois = new ObjectInputStream(fis)) {
            c = (Car)(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return c;
    }
}
