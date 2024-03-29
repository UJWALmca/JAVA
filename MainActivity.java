package com.example.labcycle04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne = new FragmentOne();
    FragmentTwo fragmentTwo = new FragmentTwo();
    int showingFragments = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.clayout,fragmentOne);
        showingFragments = 1;
        fragmentTransaction.commit();
    }

    public void SwitchFragments(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if(showingFragments==1){
            fragmentTransaction.replace(R.id.clayout,fragmentTwo);
            showingFragments = 2;
        }
        else {
            fragmentTransaction.replace(R.id.clayout,fragmentOne);
            showingFragments = 1;
        }
        fragmentTransaction.commit();
    }
}