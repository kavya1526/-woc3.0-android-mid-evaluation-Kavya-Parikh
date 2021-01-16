package com.example.timetablewinter2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class monday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.key);
        TextView textView=findViewById(R.id.day);
        textView.setText(message);
    }
}