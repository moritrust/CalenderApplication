package com.example.calenderapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class InputSchedule extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.InputSchedule);

        TextView textView = findViewById(R.id.InputScheduleTextView);
        Button returnButton = findViewById(R.id.Returnbutton);
        Intent intent = getIntent();
        String date = intent.getStringExtra("DATE_DATA");


        textView.setText(date);




        returnButton.setOnClickListener(v -> finish());




    }

}
