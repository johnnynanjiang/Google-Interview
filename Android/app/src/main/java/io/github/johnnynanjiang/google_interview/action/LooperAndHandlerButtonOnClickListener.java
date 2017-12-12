package io.github.johnnynanjiang.google_interview.action;

import android.view.View;

import io.github.johnnynanjiang.google_interview.test.TestHandlerThread;

/**
 * Created by nanjiang on 12/12/17.
 */

public class LooperAndHandlerButtonOnClickListener implements View.OnClickListener
{
    @Override
    public void onClick(View v) {
        TestHandlerThread testHandlerThread = new TestHandlerThread("testHandlerThread");
        testHandlerThread.start();

        testHandlerThread.post(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("handler.post() sleep(1000)");
            }
        });

        testHandlerThread.post(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("handler.post() sleep(2000)");
            }
        });

        testHandlerThread.quit();

        System.out.println("buttonLooperAndHandler.onClick()");
    }
}
