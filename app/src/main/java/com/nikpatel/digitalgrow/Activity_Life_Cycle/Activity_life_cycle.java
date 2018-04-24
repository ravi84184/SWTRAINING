package com.nikpatel.digitalgrow.Activity_Life_Cycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 19/08/17.
 */

public class Activity_life_cycle extends AppCompatActivity{

    private static final String TAG = "Activity_life_cycle";

    TextView fname,lname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Intent intent = getIntent();
        fname = (TextView) findViewById(R.id.fname);
        lname = (TextView) findViewById(R.id.lname);
        String namef = intent.getStringExtra("fname");
        String namel = intent.getStringExtra("lname");

        fname.setText(namef);
        lname.setText(namel);
        Log.e(TAG, "onCreate: " );
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart" );
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause " );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop " );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy " );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume ");
    }
}
