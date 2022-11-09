import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Monte Carlo Estimate: Generates 2-dimensional points in the [0.0,2.0) x
 * [0.0,2.0) square then computes an estimate of the area of the quarter circle
 * of radius 2 centered at (0.0,0.0).
 */
public final class MonteCarlo1 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private MonteCarlo1() {
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        /*
         * Open input and output streams
         */
        SimpleReader input = new SimpleReader1L();
        SimpleWriter output = new SimpleWriter1L();
        /*
         * Ask user for number of 2-d points to generate
         */
        output.print("Number of points: ");
        int n = input.nextInteger();
        /*
         * Declare counters and initialize them
         */
        int ptsInInterval = 0, ptsInQuarterCircle = 0;
        /*
         * Create pseudo-random number generator
         */
        Random rnd = new Random1L();
        /*
         * Generate points and count how many fall within the area of the circle
         */
        while (ptsInInterval < n) {
            /*
             * Generate 2 pseudo-random numbers in [0.0,2.0) interval
             */
            double x = rnd.nextDouble() * 2;
            double y = rnd.nextDouble() * 2;
            /*
             * Increment total number of generated 2-d points
             */
            ptsInInterval++;
            /*
             * Check if point is in the circle and increment counter if it is
             */
            if ((x * x) + (y * y) < 4) {
                ptsInQuarterCircle++;
            }
        }
        /*
         * Estimate area of the circle of radius 1 centered at (1.0,1.0)
         */
        double estimate = (4.0 * ptsInQuarterCircle) / ptsInInterval;
        output.println("Estimated Area of Quarter Circle: " + estimate);
        /*
         * Close input and output streams
         */
        input.close();
        output.close();
    }

}
