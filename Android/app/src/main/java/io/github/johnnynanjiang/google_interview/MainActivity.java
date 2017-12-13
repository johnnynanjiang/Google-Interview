package io.github.johnnynanjiang.google_interview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import io.github.johnnynanjiang.google_interview.action.AsyncTaskButtonOnClickListener;
import io.github.johnnynanjiang.google_interview.action.LooperAndHandlerButtonOnClickListener;
import io.github.johnnynanjiang.google_interview.test.TestHandlerThread;

public class MainActivity extends AppCompatActivity {
    Button buttonAsyncTask;
    Button buttonLooperAndHandler1;
    Button buttonLooperAndHandler2;
    Button buttonLooperAndHandlerQuit;

    TestHandlerThread testHandlerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startHandlerThread();
        setUpView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        testHandlerThread.quit();
    }

    void setUpView() {
        buttonAsyncTask = findViewById(R.id.button_async_task);
        buttonAsyncTask.setOnClickListener(
                new AsyncTaskButtonOnClickListener()
        );

        buttonLooperAndHandler1 = findViewById(R.id.button_looper_and_handler_1);
        buttonLooperAndHandler1.setOnClickListener(
                new LooperAndHandlerButtonOnClickListener(testHandlerThread.getHandler(), 1000)
        );
        buttonLooperAndHandler2 = findViewById(R.id.button_looper_and_handler_2);
        buttonLooperAndHandler2.setOnClickListener(
                new LooperAndHandlerButtonOnClickListener(testHandlerThread.getHandler(), 2000)
        );
        buttonLooperAndHandlerQuit = findViewById(R.id.button_looper_and_handler_quit);
        buttonLooperAndHandlerQuit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        testHandlerThread.quit();
                    }
                }
        );
    }

    void startHandlerThread() {
        testHandlerThread = new TestHandlerThread();
        testHandlerThread.start();
    }
}
