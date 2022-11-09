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
public final class ProgramWithIO {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private ProgramWithIO() {
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

        int areaBound = in.nextInteger();
        int sum = 0;

        int n = 1, m = 1;

        while (n * n < areaBound) {
            while (m * m < areaBound) {
                sum += ((n * n) + (m * m));
                m++;
            }
            m = 1;
            n++;
        }

        out.print(sum);
        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
