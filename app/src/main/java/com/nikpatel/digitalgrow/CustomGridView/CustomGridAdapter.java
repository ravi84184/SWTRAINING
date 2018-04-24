package com.nikpatel.digitalgrow.CustomGridView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nikpatel.digitalgrow.R;

import java.util.ArrayList;

/**
 * Created by nikpatel on 02/09/17.
 */

public class CustomGridAdapter extends BaseAdapter {

    private ArrayList<ImageAndText> item;
    private Context mContext;

    public CustomGridAdapter(Context mContext,ArrayList<ImageAndText> item) {
        this.item = item;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return item.size();
    }

    @Override
    public Object getItem(int i) {
        return item.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        if (view == null){
            //view = inflater.inflate(R.layout.activity_custom_grid_result,null);

            view = LayoutInflater.from(mContext).inflate(R.layout.activity_custom_grid_result,null);
        }

        final ImageAndText imageAndText = (ImageAndText) getItem(i);

        TextView name = (TextView) view.findViewById(R.id.textView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);

        imageView.setImageResource(imageAndText.getImg());
        name.setText(imageAndText.getName());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, imageAndText.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
