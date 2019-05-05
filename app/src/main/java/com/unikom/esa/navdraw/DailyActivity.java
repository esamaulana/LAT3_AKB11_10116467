package com.unikom.esa.navdraw;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class DailyActivity extends Fragment {

    public DailyActivity() {
    }

    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_daily, container, false);

        getActivity().setTitle("Daily Activity");


        Button btn_friend = (Button) view.findViewById(R.id.btn_friend);
        btn_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(getActivity(), DailyActActivity.class);
                startActivity(i);
            }
        });

        Button btn_daily = (Button) view.findViewById(R.id.btn_daily);
        btn_daily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(getActivity(), FriendActivity.class);
                startActivity(i);
            }
        });

        return view;
    }
}