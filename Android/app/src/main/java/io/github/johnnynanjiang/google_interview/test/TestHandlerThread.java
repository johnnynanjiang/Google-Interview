package io.github.johnnynanjiang.google_interview.test;

import android.os.Handler;
import android.os.HandlerThread;

/**
 * Created by nanjiang on 12/12/17.
 */

public class TestHandlerThread extends HandlerThread {
    private Handler handler;

    public TestHandlerThread(String name) {
        super(name);
    }

    @Override
    protected void onLooperPrepared() {
        handler = new Handler(getLooper());
    }

    public void post(Runnable runnable) {
        handler.post(runnable);
    }
}
