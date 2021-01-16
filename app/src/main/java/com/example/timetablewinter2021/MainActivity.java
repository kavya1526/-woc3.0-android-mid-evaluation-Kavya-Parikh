package com.example.timetablewinter2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String key="com.example.TimeTableWinter2021.key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void monday(View view)
    {
        Intent intent=new Intent(this,monday.class);
        Button b1=findViewById(R.id.button1);
        String message=b1.getText().toString() + " Schedule: ";
        intent.putExtra(key,message);
        startActivity(intent);
    }
}