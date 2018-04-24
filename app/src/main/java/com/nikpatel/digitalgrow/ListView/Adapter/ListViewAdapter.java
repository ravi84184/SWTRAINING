package com.nikpatel.digitalgrow.ListView.Adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nikpatel.digitalgrow.ListView.Model.ListItems;
import com.nikpatel.digitalgrow.R;
import java.util.*;

/**
 * Created by nikpatel on 27/08/17.
 */

public class ListViewAdapter extends BaseAdapter {

    private static final String TAG = "ListViewAdapter";

    Context context;
    List<ListItems> itemsList;

    public ListViewAdapter(Context context, List<ListItems> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @Override
    public int getCount() {
        return itemsList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemsList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return itemsList.indexOf(getItem(i));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if (view == null){

            view = inflater.inflate(R.layout.row_list_item,null);
            holder = new ViewHolder();
            holder.lan = (TextView) view.findViewById(R.id.tv_text);
            holder.image = (ImageView) view.findViewById(R.id.img_view);
            view.setTag(holder);
//            TextView lan = (TextView) view.findViewById(R.id.tv_text);
//            ImageView image = (ImageView) view.findViewById(R.id.imageView);

        }else {
            holder = (ViewHolder) view.getTag();
        }
        Log.e(TAG, "getView: " );
        final ListItems listItems = (ListItems) getItem(i);
        holder.lan.setText(listItems.getLan());
        Log.e(TAG, "getView: "+listItems.getImg() );
        holder.image.setImageResource(listItems.getImg());

        return view;
    }

    private class ViewHolder {
        TextView lan;
        ImageView image;
    }
}
