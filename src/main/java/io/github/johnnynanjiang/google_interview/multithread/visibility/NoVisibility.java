package io.github.johnnynanjiang.google_interview.multithread.visibility;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 1/12/17.
 */

public class NoVisibility extends Thread {
    private static boolean stopRunning;

    public static void main(String[] args) throws InterruptedException {
        NoVisibility thread = new NoVisibility();
        thread.start();

        Thread.sleep(2000);

        stopRunning = true;
        Print.toConsole("Code execution: thread.stopRunning = true;");
    }

    public void run() {
        int i = 0;
        while (true) {
            Print.toConsole("Keep running %d ...", i++);

            if (stopRunning) {
                Print.toConsole("Stopped running ***");
                break;
            }
        }
    }
}
