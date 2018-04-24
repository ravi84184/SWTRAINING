package com.nikpatel.digitalgrow.Form;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.nikpatel.digitalgrow.Activity_Life_Cycle.Activity_life_cycle;
import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 26/08/17.
 */

public class OnclickActivity extends AppCompatActivity {
    private static final String TAG = "OnclickActivity";

    private EditText edFirstName, edLastName;
    private RadioGroup radioGroup;
    private CheckBox checkBox;
    private Button btnSubmit;
    private RadioButton rad;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_onclick_event);


        edFirstName = (EditText) findViewById(R.id.edtFirstName);
        edLastName = (EditText) findViewById(R.id.edtLastName);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        checkBox = (CheckBox) findViewById(R.id.checkbox);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnclickActivity.this,Activity_life_cycle.class);
                String Fristname = edFirstName.getText().toString();
                String LastName = edLastName.getText().toString();
                intent.putExtra("fname",Fristname);
                intent.putExtra("lname",LastName);
                startActivity(intent);

                if (checkBox.isChecked()){
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    String lol = String.valueOf(selectedId);
                    rad = (RadioButton) findViewById(selectedId);

                    Toast.makeText(OnclickActivity.this, "Welcome " +Fristname+" "+LastName +"\n"
                            +"You are "+rad.getText().toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    protected void onStart() {
        Log.e(TAG, "onStart" );
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart " );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop" );
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
