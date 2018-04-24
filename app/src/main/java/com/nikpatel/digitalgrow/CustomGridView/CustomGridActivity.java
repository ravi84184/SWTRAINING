package com.nikpatel.digitalgrow.CustomGridView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.nikpatel.digitalgrow.R;

import java.util.*;
public class CustomGridActivity extends AppCompatActivity {


    private GridView gridView;
    private CustomGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = (GridView) findViewById(R.id.gridView);

        adapter = new CustomGridAdapter(this,getItem());

        gridView.setAdapter(adapter);

    }

    private ArrayList getItem(){

        ArrayList<ImageAndText> arrayList = new ArrayList<>();

        ImageAndText model = new ImageAndText();
        model.setName("Android 1");
        model.setImg(R.drawable.android1);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 2");
        model.setImg(R.drawable.android2);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 3");
        model.setImg(R.drawable.android3);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 4");
        model.setImg(R.drawable.android4);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 1");
        model.setImg(R.drawable.android1);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 2");
        model.setImg(R.drawable.android2);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 3");
        model.setImg(R.drawable.android3);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 4");
        model.setImg(R.drawable.android4);
        arrayList.add(model);

        model.setName("Android 1");
        model.setImg(R.drawable.android1);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 2");
        model.setImg(R.drawable.android2);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 3");
        model.setImg(R.drawable.android3);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 4");
        model.setImg(R.drawable.android4);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 1");
        model.setImg(R.drawable.android1);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 2");
        model.setImg(R.drawable.android2);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 3");
        model.setImg(R.drawable.android3);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 4");
        model.setImg(R.drawable.android4);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 1");
        model.setImg(R.drawable.android1);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 2");
        model.setImg(R.drawable.android2);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 3");
        model.setImg(R.drawable.android3);
        arrayList.add(model);

        model = new ImageAndText();
        model.setName("Android 4");
        model.setImg(R.drawable.android4);
        arrayList.add(model);

        return arrayList;
    }
}
