package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class RootActivity extends Fragment {

    public RootActivity(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.activity_root, container, false);

        getActivity().setTitle("NavDraw");

        return rootView;
    }
}