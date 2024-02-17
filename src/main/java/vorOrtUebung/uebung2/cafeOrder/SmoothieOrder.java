package vorOrtUebung.uebung2.cafeOrder;

public class SmoothieOrder extends CafeOrder {
	@Override
	protected void prepareOrder() {
		System.out.println("Grinding fruits.");
		System.out.println("Adding milk");
		System.out.println("Pouring smoothie");

	}
}
