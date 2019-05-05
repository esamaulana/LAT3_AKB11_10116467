package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ImageButton btn_reddit = (ImageButton) findViewById(R.id.btn_reddit);
        btn_reddit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reddit.com/user/helius_aim"));
                startActivity(i);
            }
        });

        ImageButton btn_insta = (ImageButton) findViewById(R.id.btn_insta);
        btn_insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.instagram.com/esamaulana00/"));
                startActivity(i);
            }
        });

        ImageButton btn_facebook = (ImageButton) findViewById(R.id.btn_facebook);
        btn_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://facebook.com/heliusaimed"));
                startActivity(i);
            }
        });

        ImageButton btn_twitter = (ImageButton) findViewById(R.id.btn_twitter);
        btn_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://twitter.com/Helius_aim"));
                startActivity(i);
            }
        });

        ImageButton btn_wordpress = (ImageButton) findViewById(R.id.btn_wordpress);
        btn_wordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://esacreator.wordpress.com"));
                startActivity(i);
            }
        });

        ImageButton btn_pinterest = (ImageButton) findViewById(R.id.btn_pinterest);
        btn_pinterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://id.pinterest.com/helius_aim00/"));
                startActivity(i);
            }
        });

    }
}
