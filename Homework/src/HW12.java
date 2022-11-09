import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * CSE 2221 Homework 12 - Recursion 1.
 *
 * @author Hojin Yun
 *
 */
public final class HW12 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private HW12() {
    }

    /**
     * Returns the number of digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to count
     * @return the number of digits of {@code n}
     * @ensures numberOfDigits = [number of digits of n]
     */
    private static int numberOfDigits(NaturalNumber n) {

        int digits = 0;

        n.divideBy10();

        if (n.isZero()) {

            return 1;

        } else {

            digits++;
            digits += numberOfDigits(n);
        }

        return digits;
    }

    /**
     * Returns the sum of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to add
     * @return the sum of the digits of {@code n}
     * @ensures sumOfDigits = [sum of the digits of n]
     */
    private static int sumOfDigits(NaturalNumber n) {

        int sum = 0;

        int remainder = n.divideBy10();

        if (n.isZero()) {

            return remainder;

        } else {

            sum += remainder;
            sum += sumOfDigits(n);
        }

        return sum;
    }

    /**
     * Returns the sum of the digits of {@code n}.
     *
     * @param n
     *            {@code NaturalNumber} whose digits to add
     * @return the sum of the digits of {@code n}
     * @ensures sumOfDigits = [sum of the digits of n]
     */
    private static NaturalNumber sumOfDigits2(NaturalNumber n) {

        NaturalNumber sum = new NaturalNumber1L(n.divideBy10());

        if (n.isZero()) {

            return sum;

        } else {

            sum.add(sumOfDigits2(n));
        }

        return sum;
    }

    /**
     * Divides {@code n} by 2.
     *
     * @param n
     *            {@code NaturalNumber} to be divided
     * @updates n
     * @ensures 2 * n <= #n < 2 * (n + 1)
     */
    private static void divideBy2(NaturalNumber n) {

        //Don't know how to do this one... :(
    }

    /**
     * Checks whether a {@code String} is a palindrome.
     *
     * @param s
     *            {@code String} to be checked
     * @return true if {@code s} is a palindrome, false otherwise
     * @ensures isPalindrome = (s = rev(s))
     */

    private static boolean isPalindrome(String s) {

        if (s.length() == 1) {

            return true;

        } else {

            if (s.charAt(0) != s.charAt(s.length() - 1)) {
                return false;
            } else {
                return isPalindrome(s.substring(1, s.length() - 1));
            }
        }
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

        NaturalNumber num = new NaturalNumber1L(1018938);
        String s = "abcdcb";

        out.println(numberOfDigits(num));
        out.println(sumOfDigits(num));
        out.println(sumOfDigits2(num));
        divideBy2(num);
        out.println(num);
        out.println(isPalindrome(s));

        in.close();
        out.close();
    }

}
