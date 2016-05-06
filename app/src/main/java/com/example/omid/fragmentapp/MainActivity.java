package com.example.omid.fragmentapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity implements Fragment_one.SendMessage, Fragment_two.SendMessageTOFragment3{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        Fragment_one first_fragment=new Fragment_one();
        fragmentTransaction.replace(android.R.id.content, first_fragment);
        fragmentTransaction.commit();
    }

    public void sendData(String message){
        Bundle bundle = new Bundle();
        bundle.putString("msg",message);
//        Fragment_two f2 = (Fragment_two) getFragmentManager().findFragmentById(R.id.fragment2);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        Fragment_two f2 = new Fragment_two();
        f2.setArguments(bundle);
        fragmentTransaction.replace(android.R.id.content, f2);
        fragmentTransaction.commit();
//        f2.getData(message);
    }

    public void sendDataToFragment3(String message, String message2){
        Bundle bundle = new Bundle();
        bundle.putString("msg",message);
        bundle.putString("msg2",message2);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction =
                fragmentManager.beginTransaction();
        FragmentThree f3 = new FragmentThree();
        f3.setArguments(bundle);
        fragmentTransaction.replace(android.R.id.content, f3);
        fragmentTransaction.commit();
//        f2.getData(message);
    }

//    public void sendData(String message) {
//
////        Fragment_two fragment2 = new Fragment_two();
////        FragmentManager fragmentManager = getFragmentManager();
////        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
////        fragmentTransaction.replace(R.id.contain, fragment2);
////        fragmentTransaction.addToBackStack(null);
////        fragmentTransaction.commit();
//
//    }

}
