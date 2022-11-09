import components.queue.Queue;
import components.queue.Queue1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Homework 17 Question 2.
 *
 * @author Hojin Yun
 */
public final class Homework17_2 {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private Homework17_2() {
    }

    /**
     * Reverses ("flips") {@code this}.
     *
     * @param q
     *
     * @updates q
     * @ensures q = rev(#q)
     */
    public static void flip(Queue<T> q) {

        if (q.length() > 0) {

            T temp = q.dequeue();
            flip(q);
            q.enqueue(temp);
        }
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {

        SimpleWriter out = new SimpleWriter1L();
        Queue<T> q = new Queue1L<T>();

        flip(q);
        out.println("Hello World!");
        out.close();
    }

}
