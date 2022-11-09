import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public final class HelloWorld {

    /**
     * Repeatedly asks the user for a positive integer until the user enters
     * one. Returns the positive integer.
     *
     * @param in
     *            the input stream
     * @param out
     *            the output stream
     * @return a positive integer entered by the user
     */
    /*
     * private static int getPositiveInteger(SimpleReader in, SimpleWriter out)
     * {
     *
     * out.print("Enter your number : "); String s = in.nextLine();
     *
     * while ((!FormatChecker.canParseInt(s)) || (Integer.parseInt(s) < 1)) {
     *
     * out.println("Input needs to be a positive integer value!\n");
     *
     * out.print("Enter your number : "); s = in.nextLine(); }
     *
     * return Integer.parseInt(s); }
     */

    /*
     * int x = getPositiveInteger(in, out);
     *
     * int num = 0; String s = Integer.toString(num);
     *
     * int sum = 0;
     *
     * for (int i = 0; i < s.length(); i++) {
     *
     * if ((s.length() % 2) == 0) {
     *
     * for (int j = 0; j <= s.length(); j += 2) { sum +=
     * Character.getNumericValue(s.charAt(j)); } }
     *
     * else {
     *
     * for (int j = 1; j <= s.length(); j += 2) { sum +=
     * Character.getNumericValue(s.charAt(j)); } }
     *
     * out.print(sum); }
     */

    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();

        //out.print(Math.pow(13, -5));

        in.close();
        out.close();
    }

}
