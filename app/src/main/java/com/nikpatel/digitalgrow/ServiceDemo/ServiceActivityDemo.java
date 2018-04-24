package com.nikpatel.digitalgrow.ServiceDemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

public class ServiceActivityDemo extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;
    Button btnStart,btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_demo);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnStart = (Button) findViewById(R.id.btnStart);
        btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btnStart:
                Intent intent = new Intent(ServiceActivityDemo.this,ServiceDemo.class);
                startService(intent);
                break;

            case R.id.btnStop:
                Intent intent1 = new Intent(ServiceActivityDemo.this,ServiceDemo.class);
                stopService(intent1);
                break;

            default:
                break;

        }
    }
}
