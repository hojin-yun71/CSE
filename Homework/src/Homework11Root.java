import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class Homework11Root {

    private Homework11Root() {
    }

    /**
     * Returns {@code n} to the power {@code p}.
     *
     * @param n
     *            the number to which we want to apply the power
     * @param p
     *            the power
     * @return the number to the power
     * @requires Integer.MIN_VALUE <= n ^ (p) <= Integer.MAX_VALUE and p >= 0
     * @ensures power = n ^ (p)
     */
    private static int power(int n, int p) {

    }

    /**
     * Returns the {@code r}-th root of {@code n}.
     *
     * @param n
     *            the number to which we want to apply the root
     * @param r
     *            the root
     * @return the root of the number
     * @requires n >= 0 and r > 0
     * @ensures root ^ (r) <= n < (root + 1) ^ (r)
     */

    private static int root(int n, int r) {

        int low = 0;
        int high = n;
        int guess = (low + high) / 2;

        while ((high - low) > 1) {

            if ((power(low, r) <= power(guess, r))
                    && (power(guess, r) < power(n, r))) {

                high = guess;
                guess = (low + high) / 2;

            } else {

                low = guess;
                guess = (low + high) / 2;
            }
        }

        return guess;
    }

    public static void main(String[] args) {
        SimpleReader in = new SimpleReader1L();
        SimpleWriter out = new SimpleWriter1L();

        root(0, 0);

        in.close();
        out.close();
    }

}
