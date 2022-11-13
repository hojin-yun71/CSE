import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework10 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework10() {
    }

    /**
     * Swaps the two given {@code NaturalNumber}s.
     *
     * @param n1
     *            the first {@code NaturalNumber}
     * @param n2
     *            the second {@code NaturalNumber}
     * @updates n1
     * @updates n2
     * @ensures n1 = #n2 and n2 = #n1
     */
    private static void swapNN(NaturalNumber n1, NaturalNumber n2) {

        NaturalNumber temp = new NaturalNumber1L(n1);

        n1.transferFrom(n2);
        n2.transferFrom(temp);
    }

    /**
     * Squares a given {@code NaturalNumber}.
     *
     * @param n
     *            the number to square
     * @updates n
     * @ensures n = #n * #n
     */

    private static void square(NaturalNumber n) {

        n.power(2);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {

        NaturalNumber n = new NaturalNumber1L();
        NaturalNumber n1 = new NaturalNumber1L();
        NaturalNumber n2 = new NaturalNumber1L();

        swapNN(n1, n2);
        square(n);
    }

}
