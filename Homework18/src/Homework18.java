import java.util.Comparator;

import components.queue.Queue;
import components.queue.Queue1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Homework 18.
 *
 * @author Hojin Yun
 */
public final class Homework18 {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private Homework18() {
        // no code needed here
    }

    /**
     * Removes and returns the minimum value from {@code q} according to the
     * ordering provided by the {@code compare} method from {@code order}.
     *
     * @param q
     *            the queue
     * @param order
     *            ordering by which to compare entries
     * @return the minimum value from {@code q}
     * @updates q
     * @requires <pre>
     * q /= empty_string  and
     *  [the relation computed by order.compare is a total preorder]
     * </pre>
     * @ensures <pre>
     * perms(q * <removeMin>, #q)  and
     *  for all x: string of character
     *      where (x is in entries (q))
     *    ([relation computed by order.compare method](removeMin, x))
     * </pre>
     */
    private static String removeMin(Queue<String> q, Comparator<String> order) {

        String min = q.front();
        Queue<String> qCopy = q.newInstance();
        qCopy.transferFrom(q);

        for (int i = 0; i < qCopy.length(); i++) {

            String candidate = qCopy.dequeue();

            if (order.compare(candidate, min) < 0) {

                min = candidate;

            } else {

                q.enqueue(candidate);
            }
        }

        return min;
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     * @param order
     */
    public static void main(String[] args, Comparator<String> order) {

        SimpleWriter out = new SimpleWriter1L();

        Queue<String> q = new Queue1L<String>();

        q.enqueue("lol");
        q.enqueue("lmao");
        q.enqueue("test");
        q.enqueue("A");

        String min = removeMin(q, order);

        out.print(min);
    }
}
