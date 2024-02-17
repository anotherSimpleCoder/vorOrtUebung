package vorOrtUebung.uebung3.numbers;

import java.util.Locale;

public class SpeedOfLight {
    public static final long c = 299792458;

    public static double fraction(double factor) throws IllegalArgumentException {
        if(factor > 1 || factor < 0) {
            throw new IllegalArgumentException();
        }

        return factor * SpeedOfLight.c;
    }

    public static void printFraction(double factor) {
        try {
            double res = SpeedOfLight.fraction(factor);
            System.out.printf(Locale.US, "%,.2f \n", res);
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument provided!");
        }
    }
}
