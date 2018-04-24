package com.nikpatel.digitalgrow.ListView;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class List_Activity_Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list___result);

        Intent intent = getIntent();
        String result = intent.getStringExtra("NAME");

        TextView txtResult = (TextView) findViewById(R.id.txtResult);
        txtResult.setText(result);

    }
}
