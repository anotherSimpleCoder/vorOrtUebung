package vorOrtUebung.uebung3;

import org.junit.jupiter.api.Test;
import vorOrtUebung.uebung3.mathUtils.MathUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    @Test
    public void testDivide() {
        int[][] operands = {{1,2}, {4,3}, {5,6}};

        for(int[] o: operands) {
            double res = MathUtils.divide(o[0], o[1]);
            assertEquals(res, o[0]/o[1]);
        }
    }
}
