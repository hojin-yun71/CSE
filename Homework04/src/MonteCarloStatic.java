import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * @author Hojin Yun
 */

public final class MonteCarloStatic {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private MonteCarloStatic() {
    }

    /**
     * Checks whether the given point (xCoord, yCoord) is inside the circle of
     * radius 1.0 centered at the point (1.0, 1.0).
     *
     * @param xCoord
     *            the x coordinate of the point
     * @param yCoord
     *            the y coordinate of the point
     * @return true if the point is inside the circle, false otherwise
     */
    private static boolean pointIsInCircle(double xCoord, double yCoord) {

        if (((xCoord - 1) * (xCoord - 1)) + ((yCoord - 1) * (yCoord - 1)) < 1) {
            return true;
        }
        return false;
    }

    /**
     * Generates n pseudo-random points in the [0.0,2.0) x [0.0,2.0) square and
     * returns the number that fall in the circle of radius 1.0 centered at the
     * point (1.0, 1.0).
     *
     * @param n
     *            the number of points to generate
     * @return the number of points that fall in the circle
     */
    private static int numberOfPointsInCircle(int n) {

        Random rnd = new Random1L();

        int pointsInCircle = 0;

        for (int i = 0; i < n; i++) {
            double xCoord = rnd.nextDouble() * 2;
            double yCoord = rnd.nextDouble() * 2;

            if (pointIsInCircle(xCoord, yCoord)) {
                pointsInCircle++;
            }
        }

        return pointsInCircle;
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

        int n = in.nextInteger();

        int ptsInCircle = numberOfPointsInCircle(n);

        double estimate = (4.0 * ptsInCircle) / n;
        out.println("Estimated Value of Pi: " + estimate);

        in.close();
        out.close();
    }

}
