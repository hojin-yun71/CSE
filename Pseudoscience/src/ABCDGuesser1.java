import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
import components.utilities.FormatChecker;

/**
 * CSE 2221 Project 3 - Pseudoscience
 *
 * Computes the best approximation using the de Jager formula along with the
 * exponents and relative error for the best approximation.
 *
 * @author Hojin Yun
 *
 */
public final class ABCDGuesser1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ABCDGuesser1() {
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

        out.print("Enter a positive real number : ");
        String s1 = in.nextLine();

        while (!(FormatChecker.canParseDouble(s1))
                || (Double.parseDouble(s1) <= 0)) {

            out.print(
                    "Input is not a positive real number.\n\nEnter a positive real number : ");
            s1 = in.nextLine();
        }

        return Double.parseDouble(s1);
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

        out.print("Enter a positive real number that is not 1 : ");
        String s2 = in.nextLine();

        while (!(FormatChecker.canParseDouble(s2))
                || (Double.parseDouble(s2) <= 0)
                || (Double.parseDouble(s2) == 1)) {

            out.print(
                    "Input is either not a positive real number or 1.\n\nEnter a positive real number that is not 1 : ");
            s2 = in.nextLine();
        }

        return Double.parseDouble(s2);
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

        double approx;
        double bestApprox = -1;
        double[] exponents = { -5, -4, -3, -2, -1, -1.0 / 2.0, -1.0 / 3.0,
                -1.0 / 4.0, 0, 1.0 / 4.0, 1.0 / 3.0, 1.0 / 2.0, 1, 2, 3, 4, 5 };

        int i = 0, j = 0, k = 0, l = 0;
        int iTemp = -1, jTemp = -1, kTemp = -1, lTemp = -1;

        while (i < exponents.length) {

            while (j < exponents.length) {

                while (k < exponents.length) {

                    while (l < exponents.length) {

                        approx = (Math.pow(w, exponents[i]))
                                * (Math.pow(x, exponents[j]))
                                * (Math.pow(y, exponents[k]))
                                * (Math.pow(z, exponents[l]));

                        if ((Math.abs(u - approx)) < (Math
                                .abs(u - bestApprox))) {

                            bestApprox = approx;

                            iTemp = i;
                            jTemp = j;
                            kTemp = k;
                            lTemp = l;
                        }
                        l++;
                    }
                    l = 0;
                    k++;
                }
                k = 0;
                j++;
            }
            j = 0;
            i++;
        }

        out.println("\nBest approximation : " + bestApprox);
        out.println("Exponents : " + iTemp + " " + jTemp + " " + kTemp + " "
                + lTemp);
        out.println("Relative error : " + ((Math.abs(u - bestApprox) / u) * 100)
                + "%");

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
