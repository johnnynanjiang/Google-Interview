package io.github.johnnynanjiang.googleinterview;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;

/**
 * Created by nanjiang on 7/12/17.
 */

public class TestAsyncTask extends AsyncTask<Void, String, Void> {
    Context context;
    ProgressDialog progressDialog;
    boolean cancel = false;

    public TestAsyncTask(Context context) {
        this.context = context;
    }

    @Override
    protected Void doInBackground(Void... values) {
        for (int i = 1; i <= 10000; i++) {
            if (cancel) {
                System.out.println(String.format("TestAsyncTask.doInBackground() cancelled"));
                break;
            }

            String msg = String.format("TestAsyncTask.doInBackground() #%d", i);
            publishProgress(msg);
            System.out.println(msg);
        }

        return null;
    }

    @Override
    protected void onPreExecute() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setTitle("Progress");
        progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        cancel = true;
                    }
        });
        progressDialog.show();
    }

    @Override
    protected void onPostExecute(Void result) {
        progressDialog.dismiss();
    }

    @Override
    protected void onProgressUpdate(String... values) {
        progressDialog.setMessage(values[0]);
        System.out.println(String.format("TestAsyncTask.onProgressUpdate() %s", values[0]));
    }
}
