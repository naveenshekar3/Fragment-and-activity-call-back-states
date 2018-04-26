package com.example.root.fragmentandactivitycallbackstatetask;


import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {


    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_first, container, false);
        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i("First Fragment : ","onStart Callback method is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("First Fragment : ","onResume Callback method is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("First Fragment : ","onPause Callback method is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("First Fragment : ","onStop Callback method is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("First Fragment : ","onDestroy Callback method is called");
    }
}
