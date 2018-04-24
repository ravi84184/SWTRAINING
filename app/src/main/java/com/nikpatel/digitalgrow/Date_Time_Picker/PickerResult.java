package com.nikpatel.digitalgrow.Date_Time_Picker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class PickerResult extends AppCompatActivity {


    private TextView date,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picker_result);

        date = (TextView) findViewById(R.id.txtDate);
        time = (TextView) findViewById(R.id.txtTime);

        Intent intent = getIntent();

        String Date = intent.getStringExtra("date");
        String Time = intent.getStringExtra("time");

        date.setText(Date);
        time.setText(Time);

    }
}
