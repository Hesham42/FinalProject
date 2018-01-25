package com.example.jokeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidAPP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_app);
        TextView textView = (TextView)findViewById(R.id.joke);
        textView.setText(getIntent().getStringExtra("joke"));
    }
}
