package org.example.tdas;

public interface QueueOfQueues {
    Queue getFirst();
    void remove();
    void add(Queue queue);
    boolean isEmpty();
}
