package com.example.omid.fragmentapp;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by omid on 5/6/16.
 */
public class Fragment_two extends Fragment {
    SendMessageTOFragment3 sm2;
    TextView txt;
    Button btn2;
    EditText editText;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflate the layout for this fragment
         */
        View v=inflater.inflate(R.layout.fragment_two, container, false);
        editText = (EditText) v.findViewById(R.id.f2txt);
//        TextView = (TextView)v.findViewById(R.id.txt);
        btn2 = (Button)v.findViewById(R.id.bt2);
        txt = (TextView) v.findViewById(R.id.txt);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                String message2 = txt.getText().toString();
                sm2.sendDataToFragment3(message,message2);
            }
        });
        String strtext = getArguments().getString("msg");
        txt.setText(strtext);
        return v;
//        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    public interface SendMessageTOFragment3{
        void sendDataToFragment3(String message, String message2);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = (Activity) context;
        sm2 = (SendMessageTOFragment3) activity;
    }

}
