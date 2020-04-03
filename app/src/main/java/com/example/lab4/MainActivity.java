package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.lab4.Fragments.DetailFragment;
import com.example.lab4.Fragments.MenuFragment;
import com.example.lab4.Fragments.PlayMusicFragment;
import com.example.lab4.Fragments.TextFragment;


public class MainActivity extends AppCompatActivity implements MenuFragment.nextact, DetailFragment.nextact2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void nextact() {
        Intent intent = new Intent(this, Part2.class);
        startActivity(intent);
    }

    @Override
    public void nextact2() {
        Intent intent = new Intent(this, Part3.class);
        startActivity(intent);
    }
}

