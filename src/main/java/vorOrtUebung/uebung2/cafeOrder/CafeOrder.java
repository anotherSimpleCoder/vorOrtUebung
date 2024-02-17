package vorOrtUebung.uebung2.cafeOrder;

public abstract class CafeOrder {
	private void takeOrder() {
		System.out.println("Order taken");
	}

	private void serveOrder() {
		System.out.println("Order served");
	}

	private void billOrder() {
		System.out.println("Customer billed");
	}

	protected abstract void prepareOrder();

	public final void processOrder() {
		takeOrder();
		prepareOrder();
		serveOrder();
		billOrder();
	}
}
