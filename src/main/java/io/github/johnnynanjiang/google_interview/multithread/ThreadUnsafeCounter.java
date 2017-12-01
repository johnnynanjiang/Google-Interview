package io.github.johnnynanjiang.google_interview.multithread;

/**
 * Created by nanjiang on 19/11/17.
 */

public class ThreadUnsafeCounter {
    long count = 1;

    public long getCount() {
        return count++;
    }
}
