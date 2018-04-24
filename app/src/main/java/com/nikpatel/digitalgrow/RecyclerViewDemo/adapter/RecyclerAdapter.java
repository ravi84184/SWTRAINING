package com.nikpatel.digitalgrow.RecyclerViewDemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.nikpatel.digitalgrow.R;
import com.nikpatel.digitalgrow.RecyclerViewDemo.model.RecycleModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by nikpatel on 15/09/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList arrayList;

    public RecyclerAdapter(ArrayList arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item,parent,false);

        return new MyViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecyclerAdapter.MyViewHolder holder, int position) {
        RecycleModel model = (RecycleModel) arrayList.get(position);
        holder.imageView.setImageResource(model.getImg());
        holder.textView.setText(model.getName());
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.postImage);
            textView = (TextView) itemView.findViewById(R.id.txtName);
        }
    }


    public void setFilter(ArrayList<RecycleModel> newArrayList){
        arrayList = new ArrayList();
        arrayList.addAll(newArrayList);
        notifyDataSetChanged();
    }
}
