package com.example.calenderapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

//Androidで開発する際の、テンプレートクラス
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendar = findViewById(R.id.calendarView);

        calendar.setOnDateChangeListener(
                new CalendarView.OnDateChangeListener() {
                    @Override
                    public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int date) {
                        String message = year + "/" + (month + 1) + "/" + date;
                        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(MainActivity.this, InputSchedule.class);
                        intent.putExtra("DATE_DATA", message);

                        startActivity(intent);


                    }
                }
        );
    }
}