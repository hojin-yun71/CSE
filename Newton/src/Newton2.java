import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Calculates square root of inputed number to within a relative error of 0.01%.
 *
 * @author Hojin Yun
 */
public final class Newton2 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Newton2() {
    }

    /**
     * Computes estimate of square root of x to within relative error 0.01%.
     * Returns 0 if the user inputs x = 0.
     *
     * @param x
     *            Zero or positive number to compute square root of
     * @return Estimate of square root
     */
    private static double sqrt(double x) {
        /*
         * Filter out for x = 0.
         */
        if (x == 0) {
            return 0;
        }
        /*
         * Initial guess for x^0.5 is x itself.
         */
        double r = x;

        do {
            r = (r + (x / r)) / 2;
        } while (Math.abs((r * r) - x) / x >= 0.0001);

        return r;
    }

    /**
     * Main method.
     *
     * @param args
     *            The command line arguments
     */
    public static void main(String[] args) {
        /*
         * Input and output streams.
         */
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        out.print("Enter y to calculate a square root: ");
        String answer = in.nextLine();

        while (answer.equals("y")) {
            out.print("Enter number: ");
            double x = in.nextDouble();

            double result = sqrt(x);
            out.println("The square root is: " + result + "\n");

            out.print("Enter y to calculate another square root: ");
            answer = in.nextLine();
        }
        out.println("\nThanks for using my program.");
        /*
         * Close input and output streams.
         */
        in.close();
        out.close();
    }
}
