package vorOrtUebung.uebung3;

import org.junit.jupiter.api.Test;
import vorOrtUebung.uebung3.cars.Car;
import vorOrtUebung.uebung3.cars.ElectricCar;

public class CarTest {
	@Test
	public void testPrintInfo() {
		Car testCar = new Car("Volkswagen", "Golf", "black", 130.0f);
		testCar.printInfo();
	}

	@Test
	public void testElectricPrintInfo() {
		ElectricCar testElectricCar = new ElectricCar("Tesla", "Model X");
		testElectricCar.printInfo();
	}
}
