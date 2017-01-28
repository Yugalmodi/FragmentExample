package com.techpalle.fragmentexample;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //This method will be called by First fragment with Data

    public void passData(String uname){
        //Pass This data to Second Fragment
        Toast.makeText(MainActivity.this, "GOT IT..."+uname, Toast.LENGTH_SHORT).show();

        FragmentManager fragmentManager = getSupportFragmentManager();
        SecondFragment secondFragment = (SecondFragment) fragmentManager.findFragmentById(R.id.frag2);
        if(secondFragment != null){
            //Second Fragment is Available, Now send data to second Fragment
            secondFragment.catchData(uname);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
