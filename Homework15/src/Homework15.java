import components.queue.Queue;
import components.queue.Queue1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Homework 15 - Queue I.
 *
 * @author Hojin Yun
 *
 */
public final class Homework15 {

    /**
     * Private constructor so this utility class cannot be instantiated.
     */
    private Homework15() {
    }

    /**
     * Reports the smallest integer in the given {@code Queue<Integer>}.
     *
     * @param q
     *            the queue of integer
     * @return the smallest integer in the given queue
     * @requires q /= empty_string
     * @ensures <pre>
     * min is in entries(q) and
     * for all x: integer
     *     where (x is in entries(q))
     *   (min <= x)
     * </pre>
     */

    private static int min(Queue<Integer> q) {

        int min = q.dequeue();
        int length = q.length();

        for (int i = 0; i < length; i++) {

            int front = q.dequeue();

            if (front < min) {
                min = front;
            }
        }

        return min;
    }

    /**
     * Reports an array of two {@code int}s with the smallest and the largest
     * integer in the given {@code Queue<Integer>}.
     *
     * @param q
     *            the queue of integer
     * @return an array of two {@code int}s with the smallest and the largest
     *         integer in the given queue
     * @requires q /= empty_string
     * @ensures <pre>
     * { minAndMax[0], minAndMax[1] } is subset of entries(q) and
     * for all x: integer
     *     where (x in in entries(q))
     *   (minAndMax[0] <= x <= minAndMax[1])
     * </pre>
     */

    private static int[] minAndMax(Queue<Integer> q) {

        int[] minMax = new int[2];

        int min = q.dequeue();
        int max = min;

        int length = q.length();

        for (int i = 0; i < length; i++) {

            int front = q.dequeue();

            if (front < min) {
                min = front;
            }

            if (front > max) {
                max = front;
            }
        }

        minMax[0] = min;
        minMax[1] = max;

        return minMax;
    }

    /**
     * Reports an array of two {@code int}s with the smallest and the largest
     * integer in the given {@code Queue<Integer>}.
     *
     * @param q
     *            the queue of integer
     * @return an array of two {@code int}s with the smallest and the largest
     *         integer in the given queue
     * @requires q /= empty_string
     * @ensures <pre>
     * { minAndMax[0], minAndMax[1] } is subset of entries(q) and
     * for all x: integer
     *     where (x in in entries(q))
     *   (minAndMax[0] <= x <= minAndMax[1])
     * </pre>
     */

    private static int[] minAndMax2(Queue<Integer> q) {

        int[] pair = new int[2];

        int min = q.dequeue();
        int max = min;

        int length = q.length() / 2;
        int remainder = q.length() % 2;

        for (int i = 0; i < length; i++) {

            pair[0] = q.dequeue();
            pair[1] = q.dequeue();

            int temp = pair[0];

            if (pair[0] > pair[1]) {

                pair[0] = pair[1];
                pair[1] = temp;
            }

            if (pair[0] < min) {
                min = pair[0];
            }

            if (pair[1] > max) {
                max = pair[1];
            }
        }

        if (remainder == 1) {

            int last = q.dequeue();

            if (last < min) {
                min = last;
            }

            if (last > max) {
                max = last;
            }
        }

        return pair;
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

        Queue<Integer> q = new Queue1L<>();

        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(0);
        q.enqueue(13);
        q.enqueue(-3);

        out.println(min(q));

        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(0);
        q.enqueue(13);
        q.enqueue(-3);

        int[] minMax = minAndMax(q);

        for (int i = 0; i < 2; i++) {
            out.print(minMax[i] + " ");
        }

        out.println();

        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(0);
        q.enqueue(13);
        q.enqueue(-3);

        int[] minMax2 = minAndMax2(q);

        for (int i = 0; i < 2; i++) {
            out.print(minMax2[i] + " ");
        }

        /*
         * Close input and output streams
         */
        in.close();
        out.close();
    }

}
