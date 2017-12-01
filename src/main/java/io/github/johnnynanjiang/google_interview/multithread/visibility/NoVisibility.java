package io.github.johnnynanjiang.google_interview.multithread.visibility;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 1/12/17.
 */

public class NoVisibility extends Thread {
    boolean keepRunning = true;

    public static void main(String[] args) throws InterruptedException {
        NoVisibility thread = new NoVisibility();
        thread.start();
        Thread.sleep(5000);
        thread.keepRunning = false;
    }

    public void run() {
        int i = 0;
        while (keepRunning) {
            Print.toConsole("Keep running %d ...", i++);
        }
        Print.toConsole("Stopped running ***");
    }
}
