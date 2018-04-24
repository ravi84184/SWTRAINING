package com.nikpatel.digitalgrow.Alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;
import com.nikpatel.digitalgrow.ServiceDemo.ServiceActivityDemo;
import com.nikpatel.digitalgrow.ServiceDemo.ServiceDemo;

public class AlarmActivity extends AppCompatActivity {


    EditText edtTime;
    Button btnStart, btnStop;
    PendingIntent pendingIntent;
    AlarmManager alarmManager;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);


        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAlarm();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void startAlarm() {

        edtTime = (EditText) findViewById(R.id.txtTime);
        int i = Integer.parseInt(edtTime.getText().toString());

        intent = new Intent(this, AlarmBrodcastReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 234567 , intent, 0);
        alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), pendingIntent);

        Toast.makeText(this, "Alarm set in "+i+" seconds", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        if (alarmManager != null){
            alarmManager.cancel(pendingIntent);
        }
    }
}
