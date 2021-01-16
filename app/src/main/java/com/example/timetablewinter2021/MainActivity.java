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

    public void wednesday(View view)
    {
        Intent intent=new Intent(this,wednesday.class);
        startActivity(intent);
    }

    public void thursday(View view)
    {
        Intent intent=new Intent(this,thursday.class);
        startActivity(intent);
    }

    public void friday(View view)
    {
        Intent intent=new Intent(this,friday.class);
        startActivity(intent);
    }

    public void saturday(View view)
    {
        Intent intent=new Intent(this,saturday.class);
        startActivity(intent);
    }

}