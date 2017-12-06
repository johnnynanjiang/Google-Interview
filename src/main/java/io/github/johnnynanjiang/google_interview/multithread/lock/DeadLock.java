package io.github.johnnynanjiang.google_interview.multithread.lock;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 6/12/17.
 */

public class DeadLock {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    static int sleepTime = 3000;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                Print.toConsole("Thread 1 is holding lock1...");

                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Print.toConsole("Thread 1 is waiting for lock2...");

                synchronized (lock2) {
                    Print.toConsole("Thread 1 is holding lock1 and lock2...");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                Print.toConsole("Thread 2 is holding lock2...");

                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Print.toConsole("Thread 2 is waiting for lock1...");

                synchronized (lock1) {
                    Print.toConsole("Thread 2 is holding lock2 and lock1...");
                }
            }
        });

        thread1.start();
        thread2.start();
  }
}
