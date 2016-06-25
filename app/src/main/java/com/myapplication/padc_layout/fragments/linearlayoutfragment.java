package com.myapplication.padc_layout.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.myapplication.padc_layout.R;

/**
 * Created by Su Su Oo on 6/19/2016.
 */
public class linearlayoutfragment extends Fragment {


    public linearlayoutfragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linearlayout, container, false);
        return view;
    }


}
