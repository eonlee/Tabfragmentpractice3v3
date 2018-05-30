package com.example.eon.tabfragmentpractice3.Subfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.eon.tabfragmentpractice3.R;

public class Tab10Fragment extends Fragment {
    private static final String TAG = "Tab10Fragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab10_fragment,container,false);

        return view;
    }
}