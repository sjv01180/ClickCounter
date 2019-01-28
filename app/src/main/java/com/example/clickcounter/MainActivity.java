package com.example.clickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Counter count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = new Counter();
        updateView();
    }

    /**
     * Updates display for count value
     */
    private void updateView() {
        TextView display = findViewById(R.id.display);
        display.setText(String.format(Locale.US, "%d", count.getN()));
    }

    public void buttonClick(View view) {
        if (view.getId() == R.id.buttonClick)
            count.addN();
        else if (view.getId() == R.id.buttonReset)
            count.resetN();
        else
            throw new RuntimeException("unknown id error");
        updateView();
    }

}
