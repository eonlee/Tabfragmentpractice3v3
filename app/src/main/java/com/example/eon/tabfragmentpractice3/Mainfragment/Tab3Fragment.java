package com.example.eon.tabfragmentpractice3.Mainfragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.eon.tabfragmentpractice3.R;

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    private Button btnTest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3_fragment,container,false);

        btnTest = (Button) view.findViewById(R.id.btntest3);
        btnTest.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button 3 Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
