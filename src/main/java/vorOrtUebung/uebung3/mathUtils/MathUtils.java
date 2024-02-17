package vorOrtUebung.uebung3.mathUtils;

public class MathUtils {
    public static double divide(int a, int b) throws IllegalArgumentException {
        if(b == 0) {
            throw new IllegalArgumentException();
        }

        return a/b;
    }
}
