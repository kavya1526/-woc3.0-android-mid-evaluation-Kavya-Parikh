package com.example.timetablewinter2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void monday(View view)
    {
        Intent intent=new Intent(this,monday.class);
        startActivity(intent);
    }
    public void tuesday(View view)
    {
        Intent intent=new Intent(this,tuesday.class);
        startActivity(intent);
    }
}