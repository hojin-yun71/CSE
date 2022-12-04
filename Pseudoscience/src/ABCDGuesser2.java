import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.utilities.FormatChecker;

/**
 * Computes the best approximation using the de Jager formula along with the
 * exponents and relative error for the best approximation.
 *
 * @author Hojin Yun
 *
 */
public final class ABCDGuesser2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ABCDGuesser2() {
    }

    /**
     * Repeatedly asks the user for a positive real number until the user enters
     * one. Returns the positive real number.
     *
     * @param in
     *            the input stream
     * @param out
     *            the output stream
     * @return a positive real number entered by the user
     */
    private static double getPositiveDouble(SimpleReader in, SimpleWriter out) {
        out.print("Enter a positive real number: ");
        String s = in.nextLine();

        while (!(FormatChecker.canParseDouble(s))
                || !(Double.parseDouble(s) > 0)) {
            out.print(
                    "Input is not a positive real number.\n\nEnter a positive real number: ");
            s = in.nextLine();
        }

        return Double.parseDouble(s);
    }

    /**
     * Repeatedly asks the user for a positive real number not equal to 1.0
     * until the user enters one. Returns the positive real number.
     *
     * @param in
     *            the input stream
     * @param out
     *            the output stream
     * @return a positive real number not equal to 1.0 entered by the user
     */
    private static double getPositiveDoubleNotOne(SimpleReader in,
            SimpleWriter out) {
        out.print("Enter a positive real number that is not 1: ");
        String s = in.nextLine();

        while (!(FormatChecker.canParseDouble(s))
                || !(Double.parseDouble(s) > 0)
                || (Double.parseDouble(s) == 1)) {
            out.println("Input is either not a positive real number or 1.\n");
            out.println("Enter a positive real number that is not 1: ");
            s = in.nextLine();
        }

        return Double.parseDouble(s);
    }

    /**
     * Calculates the best approximation using the de Jager formula then prints
     * the exponents used and relative error for the best approximation.
     *
     * @param u
     *            number for the de Jager formula to approximate
     * @param w
     *            first base of the de Jager formula
     * @param x
     *            second base of the de Jager formula
     * @param y
     *            third base of the de Jager formula
     * @param z
     *            fourth base of the de Jager formula
     * @param out
     *            the output stream
     */
    private static void deJagerCalculation(double u, double w, double x,
            double y, double z, SimpleWriter out) {

        double guess;
        double bestGuess = -1;
        double[] exponents = { -5, -4, -3, -2, -1, -1.0 / 2.0, -1.0 / 3.0,
                -1.0 / 4.0, 0, 1.0 / 4.0, 1.0 / 3.0, 1.0 / 2.0, 1, 2, 3, 4, 5 };
        int iBest = -1, jBest = -1, kBest = -1, lBest = -1;

        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 17; j++) {
                for (int k = 0; k < 17; k++) {
                    for (int l = 0; l < 17; l++) {
                        guess = (Math.pow(w, exponents[i]))
                                * (Math.pow(x, exponents[j]))
                                * (Math.pow(y, exponents[k]))
                                * (Math.pow(z, exponents[l]));
                        if ((Math.abs(u - guess)) < (Math.abs(u - bestGuess))) {
                            bestGuess = guess;
                            iBest = i;
                            jBest = j;
                            kBest = k;
                            lBest = l;
                        }
                    }
                }
            }
        }
        out.println("\nBest approximation: " + bestGuess);
        out.println("Exponents: " + exponents[iBest] + " " + exponents[jBest]
                + " " + exponents[kBest] + " " + exponents[lBest]);
        out.println("Relative error: " + ((Math.abs(u - bestGuess) / u) * 100)
                + "%");
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        double u = getPositiveDouble(in, out);
        double w = getPositiveDoubleNotOne(in, out);
        double x = getPositiveDoubleNotOne(in, out);
        double y = getPositiveDoubleNotOne(in, out);
        double z = getPositiveDoubleNotOne(in, out);

        deJagerCalculation(u, w, x, y, z, out);
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }
}
