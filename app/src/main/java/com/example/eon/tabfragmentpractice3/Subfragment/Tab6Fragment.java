package com.example.eon.tabfragmentpractice3.Subfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.eon.tabfragmentpractice3.R;

public class Tab6Fragment extends Fragment {
    private static final String TAG = "Tab6Fragment";

    private Button btnTest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab6_fragment,container,false);

        btnTest = (Button) view.findViewById(R.id.btntest6);
        btnTest.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button 2 Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}