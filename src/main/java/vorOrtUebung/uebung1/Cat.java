package vorOrtUebung.uebung1;

public class Cat {
	private boolean active;
	private String color;
	private boolean hungry;

	private String name;
	private float weight;

	public Cat(String name, String color) {
		this.active = true;
		this.hungry = true;

		this.name = name;
		this.color = color;
		this.weight = 10.0f;
	}

	public void eat() {
		if(this.hungry) {
			hungry = false;
			this.weight++;
		}
	}

	public void printInformation() {
		System.out.println("[Cat]");
		System.out.println("active: " + this.active);
		System.out.println("color: " + this.color);
		System.out.println("hungry: " + this.hungry);
		System.out.println("name: " + this.name);
		System.out.println("weight: " + this.weight);
		System.out.println();
	}

	public void runAndMeow() {
		if(this.active) {
			this.weight--;
		}
	}

	public void sleep() {
		if(active) {
			this.active = false;
			this.hungry = true;
		}
	}

	//Getters and setters
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public boolean isActive() {
		return active;
	}

	public boolean isHungry() {
		return hungry;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
