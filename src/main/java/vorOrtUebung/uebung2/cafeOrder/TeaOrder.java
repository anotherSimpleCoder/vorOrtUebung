package vorOrtUebung.uebung2.cafeOrder;

public class TeaOrder extends CafeOrder {
	@Override
	protected void prepareOrder() {
		System.out.println("Boiling water");
		System.out.println("Pouring water in");
		System.out.println("Letting teabag rest in water");
		System.out.println("Taking out teabag");
	}
}
