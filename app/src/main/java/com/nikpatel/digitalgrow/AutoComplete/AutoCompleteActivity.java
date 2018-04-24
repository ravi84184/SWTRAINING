package com.nikpatel.digitalgrow.AutoComplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.nikpatel.digitalgrow.R;

public class AutoCompleteActivity extends AppCompatActivity {


    String [] name = {"Nik","Nikunj","Ravi","Zalak","Nikita"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,name);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.txtAuto);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
    }
}
