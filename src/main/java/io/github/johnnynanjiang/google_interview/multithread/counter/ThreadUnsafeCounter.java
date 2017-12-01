package io.github.johnnynanjiang.google_interview.multithread.counter;

/**
 * Created by nanjiang on 19/11/17.
 */

public class ThreadUnsafeCounter {
    private long count = 0;

    public long increaseCount() {
        return count++;
    }

    public long getCount() {
        return count;
    }
}
