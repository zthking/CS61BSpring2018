package synthesizer;

import java.util.Iterator;

/**
 * API includes items that can only be enqueued at the back of the queue,
 * and can only be dequeued from the front of the queue.
 * It has a fixed capacity, and nothing is allowed to enqueue if the queue is full.
 */
public abstract class AbstractBoundedQueue<T>{

    protected int fillCount;
    protected int capacity;
    public int capacity()
    public int fillCount()
    public boolean isEmpty()
    public boolean isFull()
    public abstract T peek();
    public abstract T dequeue();
    public abstract void enqueue(T x);

}
