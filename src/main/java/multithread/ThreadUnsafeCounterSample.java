package multithread;

/**
 * Created by nanjiang on 19/11/17.
 */
public class ThreadUnsafeCounterSample {
    public static void main(String[] args) {
        ThreadUnsafeCounter sharedCounter = new ThreadUnsafeCounter();
        final long times = 1000000;
        // less than above value might be able to produce the issue.

        Thread thread1 = new Thread() {
            public void run() {
                for (int i = 0; i < times; i++) {
                    sharedCounter.getCount();
                }
            }
        };

        Thread thread2 = new Thread() {
            public void run() {
                for (int i = 0; i < times; i++) {
                    sharedCounter.getCount();
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}

class ThreadUnsafeCounter {
    long count = 1;

    public long getCount() {
        long tmp = count++;
        System.out.println(String.format("%d", tmp));
        return tmp;
    }
}
