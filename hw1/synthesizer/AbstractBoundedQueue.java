package synthesizer;

import java.util.Iterator;

/**
 * API includes items that can only be enqueued at the back of the queue,
 * and can only be dequeued from the front of the queue.
 * It has a fixed capacity, and nothing is allowed to enqueue if the queue is full.
 */
public abstract class AbstractBoundedQueue<T> extends BoundedQueue{

    protected int fillCount;
    protected int capacity;
    public int capacity() {
        return capacity;
    };
    public int fillCount() {
        return fillCount;
    };
    public boolean isEmpty() {
        return (this.fillCount() == 0);
    }
    public boolean isFull() {
        return (this.capacity() == this.fillCount());
    };
    public abstract T peek();
    public abstract T dequeue();
    public abstract void enqueue(T x);
}
