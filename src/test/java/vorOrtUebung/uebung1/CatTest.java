package vorOrtUebung.uebung1;

public class CatTest {
	public static void main(String[] args) {
		// Fill cat array
		Cat[] cats = new Cat[10];

		for(int i = 0; i < cats.length; i++) {
			cats[i] = new Cat("Cat" + i, "black");
		}

		//Let them all eat and run and meow
		for(Cat c: cats) {
			c.printInformation();
			c.eat();
			c.runAndMeow();
			c.printInformation();
		}

		float totalWeight = 0.0f;
		for(Cat c: cats) {
			totalWeight = totalWeight + c.getWeight();
		}

		System.out.println(totalWeight);
	}
}
