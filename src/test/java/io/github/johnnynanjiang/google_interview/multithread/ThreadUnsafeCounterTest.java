package io.github.johnnynanjiang.google_interview.multithread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 1/12/17.
 */

public class ThreadUnsafeCounterTest {
    @Test
    public void test() throws InterruptedException {
        final long loopCount = 1000000;

        ThreadUnsafeCounter sharedCounter = new ThreadUnsafeCounter();

        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < loopCount; i++) {
                    System.out.println(sharedCounter.getCount());
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < loopCount; i++) {
                    System.out.println(sharedCounter.getCount());
                }
            }
        };

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        assertTrue(
                "Should be less than 2*loopCount due to concurrency issue",
                sharedCounter.count < 2*loopCount
        );
    }
}