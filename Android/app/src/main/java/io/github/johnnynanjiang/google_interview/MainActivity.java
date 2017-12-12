package io.github.johnnynanjiang.google_interview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.github.johnnynanjiang.google_interview.util.Print;

public class MainActivity extends AppCompatActivity {
    Button buttonAsyncTask;
    Button buttonLooperAndHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpView();
    }

    void setUpView() {
        Context thisActivity = this;
        buttonAsyncTask = findViewById(R.id.button_async_task);
        buttonAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TestAsyncTask(thisActivity).execute((Void)null);
                System.out.println("buttonAsyncTask.onClick()");
            }
        });

        buttonLooperAndHandler = findViewById(R.id.button_looper_and_handler);
        buttonLooperAndHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("buttonLooperAndHandler.onClick()");
            }
        });
    }
}
