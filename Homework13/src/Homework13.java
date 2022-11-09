import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Put a short phrase describing the program here.
 *
 * @author Put your name here
 *
 */
public final class Homework13 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework13() {
    }

    /**
     * Returns the product of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to multiply
     * @return the product of the digits of {@code n}
     * @clears n
     * @ensures productOfDigits1 = [product of the digits of n]
     */
    private static NaturalNumber productOfDigits1(NaturalNumber n) {

        NaturalNumber ans = new NaturalNumber1L(1);
        NaturalNumber remainder = new NaturalNumber1L(n.divideBy10());

        if (n.isZero()) {
            ans.multiply(remainder);
        } else {
            ans.multiply(remainder);
            ans.multiply(productOfDigits1(n));
        }
        return ans;
    }

    /**
     * Returns the product of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to multiply
     * @return the product of the digits of {@code n}
     * @ensures productOfDigits2 = [product of the digits of n]
     */
    private static NaturalNumber productOfDigits2(NaturalNumber n) {

        NaturalNumber ans = new NaturalNumber1L(1);
        NaturalNumber remainder = new NaturalNumber1L(n.divideBy10());

        if (n.isZero()) {
            ans.multiply(remainder);
        } else {
            ans.multiply(remainder);
            ans.multiply(productOfDigits2(n));
        }
        n.multiplyBy10(remainder.toInt());

        return ans;
    }

    /**
     * Reports the value of {@code n} as an {@code int}, when {@code n} is small
     * enough.
     *
     * @param n
     *            the given {@code NaturalNumber}
     * @return the value
     * @requires n <= Integer.MAX_VALUE
     * @ensures toInt = n
     */
    private static int toInt(NaturalNumber n) {

        int ans = 0;
        int count = 0;

        while (!n.isZero()) {

            int base = (int) Math.pow(10, count);
            ans += n.divideBy10() * base;
            count++;
        }

        return ans;
    }

    /**
     * Reports whether the given tag appears in the given {@code XMLTree}.
     *
     * @param xml
     *            the {@code XMLTree}
     * @param tag
     *            the tag name
     * @return true if the given tag appears in the given {@code XMLTree},
     *         false otherwise
     * @ensures <pre>
     * findTag =
     *    [true if the given tag appears in the given {@code XMLTree}, false otherwise]
     * </pre>
     */
    private static boolean findTag(XMLTree xml, String tag) {

        boolean hasTag = false;

        if()
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

        NaturalNumber n = new NaturalNumber1L(in.nextInteger());
        NaturalNumber n1 = new NaturalNumber1L(n);

        out.println(productOfDigits1(n));
        out.println(productOfDigits2(n1));
        out.println(toInt(n1));

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
