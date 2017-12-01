package io.github.johnnynanjiang.google_interview.multithread;

/**
 * Created by nanjiang on 19/11/17.
 */

public class ThreadSafeCounter {
    long count = 0;

    public synchronized long getCount() {
        return count++;
    }
}
