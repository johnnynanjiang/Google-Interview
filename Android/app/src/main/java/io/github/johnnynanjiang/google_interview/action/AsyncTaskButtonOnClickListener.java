package io.github.johnnynanjiang.google_interview.action;

import android.view.View;

import io.github.johnnynanjiang.google_interview.test.TestAsyncTask;
import io.github.johnnynanjiang.google_interview.util.Print;

/**
 * Created by nanjiang on 12/12/17.
 */

public class AsyncTaskButtonOnClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        new TestAsyncTask(v.getContext()).execute((Void)null);
        Print.toConsole("buttonAsyncTask.onClick()");
    }
}
