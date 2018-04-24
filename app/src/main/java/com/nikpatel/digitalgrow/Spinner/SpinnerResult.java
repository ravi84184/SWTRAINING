package com.nikpatel.digitalgrow.Spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class SpinnerResult extends AppCompatActivity {


    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_result);

        txtResult = (TextView) findViewById(R.id.result);


        Intent intent = getIntent();
        String result = intent.getStringExtra("data");
        txtResult.setText(result);
    }
}
