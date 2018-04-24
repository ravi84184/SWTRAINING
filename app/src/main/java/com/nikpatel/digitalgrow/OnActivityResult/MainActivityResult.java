package com.nikpatel.digitalgrow.OnActivityResult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class MainActivityResult extends AppCompatActivity {


    private Button btnGet;
    private TextView txtResult;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_result);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnGet = (Button) findViewById(R.id.btn_submit);
        txtResult = (TextView) findViewById(R.id.txtresult);

        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivityResult.this,SeconActivityResult.class);

                startActivityForResult(intent , 4);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 4){

            String result = data.getStringExtra("POSTDATA");
            txtResult.setText(result);
            txtResult.setVisibility(View.VISIBLE);

        }
    }
}
