package vorOrtUebung.uebung2;

import vorOrtUebung.uebung2.cafeOrder.CafeOrder;
import vorOrtUebung.uebung2.cafeOrder.CoffeeOrder;
import vorOrtUebung.uebung2.cafeOrder.SmoothieOrder;
import vorOrtUebung.uebung2.cafeOrder.TeaOrder;

public class CafeOrderTest {
	public static void main(String[] args) {
		CafeOrder[] orders = {new CoffeeOrder(), new TeaOrder(), new SmoothieOrder()};

		for(CafeOrder o: orders) {
			o.processOrder();
		}
	}
}
