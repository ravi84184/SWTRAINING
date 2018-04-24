package com.nikpatel.digitalgrow.ListView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.*;
import com.nikpatel.digitalgrow.ListView.Adapter.ListViewAdapter;
import com.nikpatel.digitalgrow.ListView.Model.ListItems;
import com.nikpatel.digitalgrow.R;

public class ListActivity extends AppCompatActivity {


    private ListView listView;

    List<ListItems>  listItems;

    public static final String[] lan = new String[]{"Android 1","Android 2","Android 3","Android 4"};
    public static final Integer[] image = {R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.listView);

        listItems = new ArrayList<ListItems>();
        for (int i =0; i<lan.length ; i++){

            ListItems items = new ListItems(lan[i],image[i]);
            listItems.add(items);
        }
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,listItems);
        listView.setAdapter(listViewAdapter);
    }
}
