package vorOrtUebung.uebung3.cars;

import java.io.Serializable;

public class Car implements Serializable {
	private String brand;
	private String model;
	private String color;
	private float maxSpeed;

	public Car(String brand, String model, String color, float maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.color = "black";
		this.maxSpeed = 130.0f;
	}

	public void printInfo() {
		System.out.println("[Car]");
		System.out.println("brand: " + this.brand);
		System.out.println("model: " + this.model);
		System.out.println("color: " + this.color);
		System.out.println("max-speed: " + this.maxSpeed);
	}
}
