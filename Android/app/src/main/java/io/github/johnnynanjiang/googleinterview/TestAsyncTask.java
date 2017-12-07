package io.github.johnnynanjiang.googleinterview;

import android.os.AsyncTask;

/**
 * Created by nanjiang on 7/12/17.
 */

public class TestAsyncTask extends AsyncTask<String, Void, String> {
    @Override
    protected String doInBackground(String... strings) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(String.format("#%d Thread.sleep(1);", i));
        }
        return "Result of TestTask";
    }

    @Override
    protected void onPostExecute(String result) {

    }

    @Override
    protected void onPreExecute() {

    }

    @Override
    protected void onProgressUpdate(Void... values) {

    }
}
