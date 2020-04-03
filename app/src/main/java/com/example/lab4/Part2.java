package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.lab4.Fragments.List;
import com.example.lab4.Fragments.Page;

public class Part2 extends AppCompatActivity implements List.OnFragmentInteractionListener {

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);
        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .add(R.id.fragList,new List(),"fragList")
                .commit();
    }

    @Override
    public void onFragmentInteraction(String result) {

        String url = result;
        switch (result){
            case "Google":
                url = "https://www.google.com/";
                break;
            case "Facebook":
                url = "https://m.facebook.com/";
                break;
            case "Twitter":
                url = "https://mobile.twitter.com/";
                break;
            case "Xda-developer":
                url = "https://www.xda-developers.com/";
                break;
        }
        manager.beginTransaction()
                .add(R.id.fragPage, Page.newInstance(url),"fragPage")
                .commit();
    }
}
