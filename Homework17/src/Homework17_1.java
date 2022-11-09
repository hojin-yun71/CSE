import components.queue.Queue1L;

/**
 * Homework 17 Question 1.
 *
 * @author Hojin Yun
 *
 * @param <T>
 *            type of {@code Queue} entries
 */
public final class Homework17_1<T> extends Queue1L<T> {

    @Override
    /**
     * Reverses ("flips") {@code this}.
     *
     * @updates this
     * @ensures this = rev(#this)
     */
    public void flip() {

        if (this.length() > 0) {

            T temp = this.dequeue();
            this.flip();
            this.enqueue(temp);
        }
    }
}
