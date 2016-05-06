package com.example.omid.fragmentapp;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by omid on 5/6/16.
 */
public class FragmentThree extends Fragment {
    TextView txt;
    TextView txt2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_three, container, false);
        txt = (TextView) v.findViewById(R.id.text);
        txt2 = (TextView) v.findViewById(R.id.text2);
        String strF = getArguments().getString("msg");
        String strF2 = getArguments().getString("msg2");
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
//        alertDialog.setTitle(strF2+" "+strF);
        alertDialog.setMessage(strF+" "+strF2);
        alertDialog.setPositiveButton("ok",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id) {
                // if this button is clicked, close
                // current activity
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
            }
        });
        alertDialog.show();
//        txt.setText(strF);
//        txt2.setText(strF2);
        return v;
    }
}
