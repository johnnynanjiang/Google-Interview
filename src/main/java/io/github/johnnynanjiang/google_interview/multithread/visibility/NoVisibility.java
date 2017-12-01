package io.github.johnnynanjiang.google_interview.multithread.visibility;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 1/12/17.
 */

public class NoVisibility {
    boolean readyToReadTheNumber;
    int number;

    public void go() throws InterruptedException {
        new ReaderThread().start();

        Thread.sleep(5000);

        readyToReadTheNumber = true;
        number = 2;
    }

    class ReaderThread extends Thread {
        public void run() {
            while (!readyToReadTheNumber) {
                Print.toConsole("Not ready to read yet...");
                this.yield();
            }
            Print.toConsole("Read the value of the number: %d", number);
        }
    }
}
