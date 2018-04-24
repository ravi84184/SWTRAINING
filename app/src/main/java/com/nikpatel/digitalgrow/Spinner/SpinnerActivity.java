package com.nikpatel.digitalgrow.Spinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

import java.util.*;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


    private Spinner spinner;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.spinner);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        spinner.setOnItemSelectedListener(this);

        List<String> cat = new ArrayList<String>();
        cat.add("Java");
        cat.add("PHP");
        cat.add(".net");
        cat.add("AI");

        ArrayAdapter<String > adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,cat);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SpinnerActivity.this,SpinnerResult.class);
                intent.putExtra("data",String.valueOf(spinner.getSelectedItem()));
                startActivity(intent);
            }
        });
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String select = adapterView.getItemAtPosition(i).toString();

        Toast.makeText(this, "Selected Item is " +select , Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
