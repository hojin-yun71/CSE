import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Homework 7.
 *
 * @author Hojin Yun
 *
 */
public final class Homework7 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework7() {
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

        //QUESTION 1
        String s = in.nextLine();
        String ans = "";

        //a - only upper case letters
        for (int i = 0; i < s.length(); i++) {

            if (Character.isUpperCase(s.charAt(i))) {
                ans += s.charAt(i);
            }
        }

        out.println(ans);
        ans = "";

        //b - every second letter
        for (int i = 0; i < s.length(); i++) {

            if ((i % 2) != 0) {
                ans += s.charAt(i);
            }
        }

        out.println(ans);
        ans = "";

        //c - replace all vowels with an underscore
        ans = s.replaceAll("[aeiouAEIOU]", "_");

        out.println(ans);

        //d - number of vowels
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            String vowels = "aeiouAEIOU";

            if (vowels.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }

        out.println(count);

        //e - positions of all vowels
        for (int i = 0; i < s.length(); i++) {

            String vowels = "aeiouAEIOU";

            if (vowels.indexOf(s.charAt(i)) != -1) {
                out.print(i + " ");
            }
        }

        //QUESTION 3
        int[] a = { 14, 3, 13, 6, 3131, 72, -5 };

        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }
        }

        //QUESTION 4
        boolean isOrdered = true;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i + 1] < a[i]) {
                isOrdered = false;
            }
        }

        out.println(isOrdered);

        in.close();
        out.close();
    }

}
