package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Kuncoro on 22/03/2016.
 */
public class ProfileActivity extends Fragment {

    public ProfileActivity() {
    }

    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_profile, container, false);

        getActivity().setTitle("Profile");

       ImageButton  btn_contact = (ImageButton) view.findViewById(R.id.btn_contact);
        btn_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ContactActivity.class);
                startActivity(i);
            }
        });

        ImageButton btn_about = (ImageButton) view.findViewById(R.id.btn_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AboutActivity.class);
                startActivity(i);
            }
        });


        ImageButton btn_map = (ImageButton) view.findViewById(R.id.btn_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.google.com/maps/place/Jl.+Subrata,+Pungkur,+Regol,+Kota+Bandung,+Jawa+Barat+40252,+Indonesia/@-6.930996,107.6092735,19.21z/data=!4m5!3m4!1s0x2e68e89cd8c7d07f:0xfb1ce95489489a39!8m2!3d-6.9308693!4d107.6091228?shorturl=1"));
                startActivity(i);
            }
        });

        return view;
    }
}