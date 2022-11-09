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
public final class test {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private test() {
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

        double quarter = 1 / 4;
        out.println(quarter);

        in.close();
        out.close();
    }

}
