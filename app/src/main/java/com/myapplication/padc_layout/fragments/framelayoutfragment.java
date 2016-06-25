package com.myapplication.padc_layout.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.padc_layout.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class framelayoutfragment extends Fragment {

    public framelayoutfragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_framelayout, container, false);
    }
}
