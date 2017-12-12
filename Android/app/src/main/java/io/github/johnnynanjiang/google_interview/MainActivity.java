package io.github.johnnynanjiang.google_interview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import io.github.johnnynanjiang.google_interview.action.AsyncTaskButtonOnClickListener;
import io.github.johnnynanjiang.google_interview.action.LooperAndHandlerButtonOnClickListener;

public class MainActivity extends AppCompatActivity {
    Button buttonAsyncTask;
    Button buttonLooperAndHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    void setUpView() {
        buttonAsyncTask = findViewById(R.id.button_async_task);
        buttonAsyncTask.setOnClickListener(new AsyncTaskButtonOnClickListener());

        buttonLooperAndHandler = findViewById(R.id.button_looper_and_handler);
        buttonLooperAndHandler.setOnClickListener(new LooperAndHandlerButtonOnClickListener());
    }
}
