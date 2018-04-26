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
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_second, container, false);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Second Fragment : ","onStart Callback method is called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Second Fragment : ","onResume Callback method is called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Second Fragment : ","onPause Callback method is called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Second Fragment : ","onStop Callback method is called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Second Fragment : ","onDestroy Callback method is called");
    }

}
