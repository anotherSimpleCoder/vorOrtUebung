package vorOrtUebung.uebung3;

import org.junit.jupiter.api.Test;
import vorOrtUebung.uebung3.numbers.SpeedOfLight;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedOfLightTest {
    @Test
    public void printSpeedOfLight() {
        System.out.println(SpeedOfLight.c);
    }

    @Test
    public void testFactor() {
        double[] testFactors = {0.3, 0.25, 0.7};

        for(double f: testFactors) {
            double res = SpeedOfLight.fraction(f);

            assertEquals(f * SpeedOfLight.c, res, 0.001);

            SpeedOfLight.printFraction(f);
        }
    }
}
