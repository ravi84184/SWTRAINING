package com.nikpatel.digitalgrow.GridView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 01/09/17.
 */

public class GridAgapter extends BaseAdapter {

    private Context mContext;

    public GridAgapter(Context mContext) {
        this.mContext = mContext;
    }

    private Integer[] img = {
            R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4,
            R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4,
            R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4,
            R.drawable.android1,R.drawable.android2,R.drawable.android3,R.drawable.android4,
    };

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return img[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(img[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(400,400));

        return imageView;
    }
}
