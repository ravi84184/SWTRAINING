package com.nikpatel.digitalgrow.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nikpatel.digitalgrow.R;

/**
 * Created by nikpatel on 08/09/17.
 */

public class FragmentTab_Home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_home,container,false);
        return rootView;
    }
}
