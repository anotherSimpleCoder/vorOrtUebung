package vorOrtUebung.uebung2;

public class Arrays {
	int findMin(int[] a) {
		int min = a[0];

		for (int element : a) {
			if(min > element) {
				min = element;
			}
		}

		return min;
	}

	float findMax(float[] a) {
		float max = a[0];

		for (float element : a) {
			if(max < element) {
				max = element;
			}
		}

		return max;
	}
}
