package com.nikpatel.digitalgrow.GridView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.nikpatel.digitalgrow.R;

public class GridActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);


        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new GridAgapter(this));

    }
}
