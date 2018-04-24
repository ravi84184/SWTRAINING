package com.nikpatel.digitalgrow.ListView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;

public class List_Activity extends android.app.ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String [] team = getResources().getStringArray(R.array.team);
        this.setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_list_,R.id.txtName,team));

        ListView listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String name = ((TextView) view).getText().toString();
                Intent intent = new Intent(getApplicationContext(),List_Activity_Result.class);
                intent.putExtra("NAME",name);
                startActivity(intent);
            }
        });

    }
}
