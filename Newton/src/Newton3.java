import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Calculates the square root of the inputed number to within a relative error
 * of no more than 0.01%.
 *
 * @author Hojin Yun
 *
 */
public final class Newton3 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton3() {
    }

    /**
     * Computes estimate of square root of x to within relative error 0.01%.
     * Returns 0 if the user inputs x = 0.
     *
     * @param x
     *            Zero or positive number to compute square root of.
     * @param e
     *            Relative error between the estimate and the actual square root
     *            of x.
     * @return Estimate of square root.
     */
    private static double sqrt(double x, double e) {

        if (x == 0) {
            return 0;
        }

        double r = x;

        do {
            r = (r + (x / r)) / 2;
        } while ((Math.abs((r * r) - x) / x) >= (e * e));

        return r;
    }

    /**
     * Main method.
     *
     * @param args
     *            The command line arguments.
     */
    public static void main(String[] args) {

        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.print("Enter \'y' to calculate a square root : ");
        String answer = in.nextLine();

        while (answer.equals("y")) {

            out.print("Enter your number : ");
            double x = in.nextDouble();

            out.print("Enter your desired relative error (without %) : ");
            double e = in.nextDouble();

            double result = sqrt(x, e);

            out.println("The square root of your number is : " + result + "\n");

            out.print("Enter \'y' to calculate a square root : ");
            answer = in.nextLine();
        }

        out.println("\nThanks for using my program.");

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
