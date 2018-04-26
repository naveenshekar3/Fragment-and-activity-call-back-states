package com.example.root.fragmentandactivitycallbackstatetask;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private FragmentManager fragMngr;
    private FirstFragment firstFrag;
    private SecondFragment secondFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragMngr=getFragmentManager();
        firstFrag=(FirstFragment)fragMngr.findFragmentById(R.id.fragment1);
        secondFrag=(SecondFragment)fragMngr.findFragmentById(R.id.fragment2);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity : ","onStart callback method is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity : ","onResume callback method is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity : ","onPause callback method is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity : ","onStop callback method is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity : ","onDestroy callback method is called");
    }
}
