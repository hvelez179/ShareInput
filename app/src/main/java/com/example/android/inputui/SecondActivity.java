package com.example.android.inputui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView enteredText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        enteredText = (TextView) findViewById(R.id.entered_text);

        Bundle extras = getIntent().getExtras();
        enteredText.setText(extras.getString("Text Entered"));
    }
}
