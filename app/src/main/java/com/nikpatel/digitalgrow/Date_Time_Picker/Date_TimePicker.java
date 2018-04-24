package com.nikpatel.digitalgrow.Date_Time_Picker;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import com.nikpatel.digitalgrow.R;

import java.util.Calendar;

public class Date_TimePicker extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "Date_TimePicker";

    private Button btnDate,btnTime,btnNext;
    private EditText edDate,edTime;
    private int mYear, mMonth,mDate,mHours,mMinute;
    String date,time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_picker);


        btnDate = (Button) findViewById(R.id.datePicker);
        btnTime = (Button) findViewById(R.id.timePicker);
        btnNext = (Button) findViewById(R.id.btnNext);

        edDate = (EditText) findViewById(R.id.txtDate);
        edTime = (EditText) findViewById(R.id.txtTime);

        btnDate.setOnClickListener(this);
        btnTime.setOnClickListener(this);
        btnNext.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        final Calendar c = Calendar.getInstance();
        Log.e(TAG, "onClick: " );


        switch (view.getId()){
            case R.id.datePicker:
                Log.e(TAG, "onClick: DatePicker start" );

                mDate = c.get(Calendar.DAY_OF_MONTH);
                mMonth = c.get(Calendar.MONTH);
                mYear = c.get(Calendar.YEAR);
                DatePickerDialog datePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        edDate.setText(i2 +"-"+(i1 + 1)+"-"+i);
                        date = i2 +"-"+(i1 + 1)+"-"+i;
                    }
                },mYear,mMonth,mDate);
                datePicker.show();
                break;
            case R.id.timePicker:

                mHours = c.get(Calendar.HOUR_OF_DAY);
                mMinute = c.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        edTime.setText(i +":"+i1);
                        time = i +":"+i1;
                    }
                },mHours,mMinute,false);
                timePickerDialog.show();
                break;

            case R.id.btnNext:
                Intent in = new Intent(this,PickerResult.class);

                //String Date = mDate+"-"+mMonth+"-"+mYear;
                //String Time = mHours+"-"+mMinute;
                in.putExtra("date",date);
                in.putExtra("time",time);
                startActivity(in);
        }
    }
}
