package vorOrtUebung.uebung2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArraysTest {
	@Test
	public void testFindMin() {
		Arrays testArrays = new Arrays();

		int[] testArray = {2,56,1,2,9,-1,6};
		int result = testArrays.findMin(testArray);

		assertEquals(-1, result);
	}

	@Test
	public void testFindMax() {
		Arrays testArrays = new Arrays();

		float[] testArray = {2,56,1,2,9,-1,6};
		float result = testArrays.findMax(testArray);

		assertEquals(56, result);
	}
}
