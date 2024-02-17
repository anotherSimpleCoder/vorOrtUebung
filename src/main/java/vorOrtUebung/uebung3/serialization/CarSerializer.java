package vorOrtUebung.uebung3.serialization;

import vorOrtUebung.uebung3.cars.Car;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CarSerializer {
    public static void serialize(String filename, Car car) {
        try (FileOutputStream fos = new FileOutputStream(filename); ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
