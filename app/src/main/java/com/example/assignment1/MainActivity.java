package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

//Author: Daniel Xu October 2019

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView sydneyTime=findViewById(R.id.textViewTimeSydney);
        sydneyTime.setText(set24Time("Australia/Sydney"));

        TextView parisTime=findViewById(R.id.textViewTimeParis);
        parisTime.setText(set24Time("Europe/Paris"));

        TextView shanghaiTime=findViewById(R.id.textViewTimeShanghai);
        shanghaiTime.setText(set24Time("Asia/Shanghai"));

        TextView nyTime=findViewById(R.id.textViewTimeNY);
        nyTime.setText(set24Time("America/New_York"));

        TextView tokyoTime=findViewById(R.id.textViewTimeTokyo);
        tokyoTime.setText(set24Time("Asia/Tokyo"));

    }

    public void hour12Button(View view){
        TextView sydneyTime=findViewById(R.id.textViewTimeSydney);
        sydneyTime.setText(set12Time("Australia/Sydney"));

        TextView parisTime=findViewById(R.id.textViewTimeParis);
        parisTime.setText(set12Time("Europe/Paris"));

        TextView shanghaiTime=findViewById(R.id.textViewTimeShanghai);
        shanghaiTime.setText(set12Time("Asia/Shanghai"));

        TextView nyTime=findViewById(R.id.textViewTimeNY);
        nyTime.setText(set12Time("America/New_York"));

        TextView tokyoTime=findViewById(R.id.textViewTimeTokyo);
        tokyoTime.setText(set12Time("Asia/Tokyo"));


    }

    public void hour24Button(View view){
        TextView sydneyTime=findViewById(R.id.textViewTimeSydney);
        sydneyTime.setText(set24Time("Australia/Sydney"));

        TextView parisTime=findViewById(R.id.textViewTimeParis);
        parisTime.setText(set24Time("Europe/Paris"));

        TextView shanghaiTime=findViewById(R.id.textViewTimeShanghai);
        shanghaiTime.setText(set24Time("Asia/Shanghai"));

        TextView nyTime=findViewById(R.id.textViewTimeNY);
        nyTime.setText(set24Time("America/New_York"));

        TextView tokyoTime=findViewById(R.id.textViewTimeTokyo);
        tokyoTime.setText(set24Time("Asia/Tokyo"));
    }

    private String set12Time(String city){
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a z", Locale.getDefault());
        sdf.setTimeZone(TimeZone.getTimeZone(city));
        String currentTime = sdf.format(new Date());
        return currentTime;
    }

    private String set24Time(String city){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm z", Locale.getDefault());
        sdf.setTimeZone(TimeZone.getTimeZone(city));
        String currentTime = sdf.format(new Date());
        return currentTime;
    }
}
