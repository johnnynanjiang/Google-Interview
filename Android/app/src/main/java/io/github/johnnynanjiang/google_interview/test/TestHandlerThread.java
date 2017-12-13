package io.github.johnnynanjiang.google_interview.test;

import android.os.Handler;
import android.os.Looper;

/**
 * Created by nanjiang on 12/12/17.
 */

public class TestHandlerThread extends Thread {
    private volatile Handler handler;

    @Override
    public void run() {
        // preparing a looper on current thread the current thread is being detected implicitly
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }

        // now, the handler will automatically bind to the Looper that is attached to the current thread
        // You don't need to specify the Looper explicitly
        handler = new Handler();

        // After the following line the thread will start running the message loop and
        // will not normally exit the loop unless a problem happens or you quit() the looper (see below)
        Looper.loop();
    }

    public Handler getHandler() {
        return handler;
    }
}
