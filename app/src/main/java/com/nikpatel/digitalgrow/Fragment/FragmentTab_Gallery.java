package com.nikpatel.digitalgrow.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.nikpatel.digitalgrow.CustomGridView.CustomGridAdapter;
import com.nikpatel.digitalgrow.CustomGridView.ImageAndText;
import com.nikpatel.digitalgrow.R;

import java.util.ArrayList;

/**
 * Created by nikpatel on 08/09/17.
 */

public class FragmentTab_Gallery extends Fragment {


    private GridView gridView;
    private CustomGridAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_gallery,container,false);


        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        TextView textView = view.findViewById(R.id.txtGallery);
//        textView.setText("Image here");

        gridView = (GridView) view.findViewById(R.id.gridView);

        adapter = new CustomGridAdapter(getContext(),getItem());

        gridView.setAdapter(adapter);
    }
    private ArrayList getItem(){

        ArrayList<ImageAndText> arrayList = new ArrayList<>();

        ImageAndText addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 1");
        addarray.setImg(R.drawable.android1);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 2");
        addarray.setImg(R.drawable.android2);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 3");
        addarray.setImg(R.drawable.android3);
        arrayList.add(addarray);

        addarray = new ImageAndText();
        addarray.setName("Android 4");
        addarray.setImg(R.drawable.android4);
        arrayList.add(addarray);

        return arrayList;
    }

}
