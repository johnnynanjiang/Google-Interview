package io.github.johnnynanjiang.google_interview.action;

import android.os.Handler;
import android.view.View;

import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 12/12/17.
 */

public class LooperAndHandlerButtonOnClickListener implements View.OnClickListener
{
    Handler handler;
    int loopCount;

    public LooperAndHandlerButtonOnClickListener(Handler handler, int loopCount) {
        this.handler = handler;
        this.loopCount = loopCount;
    }
    @Override
    public void onClick(View v) {
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= loopCount; i++) {
                        Thread.sleep(10);
                        Print.toConsole(
                                "Thread #%d looping %d/%d...",
                                Thread.currentThread().getId(), i, loopCount
                        );
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
