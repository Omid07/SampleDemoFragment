package com.example.omid.fragmentapp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by omid on 5/6/16.
 */
public class Fragment_one extends Fragment {
    SendMessage sm;
    Button button1;
    EditText et_input;


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        View v=inflater.inflate(R.layout.fragment_one, container, false);
        et_input = (EditText) v.findViewById(R.id.et_input);
        button1 = (Button) v.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = et_input.getText().toString();
                sm.sendData(message);
            }
        });
        return v;
//        Button a=(Button) v.findViewById(R.id.button);
//                a.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                secondFragment();
//            }
//        });
//        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    public interface SendMessage {
        void sendData(String message);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        sm = (SendMessage) activity;
    }
}
