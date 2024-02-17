package vorOrtUebung.uebung2.cafeOrder;

public class CoffeeOrder extends CafeOrder {
	@Override
	protected void prepareOrder() {
		System.out.println("Grinding coffee beans.");
		System.out.println("Brewing coffee.");
		System.out.println("Pouring coffee.");
	}
}
