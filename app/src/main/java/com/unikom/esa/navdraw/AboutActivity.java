package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Button btShow = (Button) findViewById(R.id.bt_showdialog);
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(AboutActivity.this);
                dialog.setContentView(R.layout.activity_custom_dialog);
                dialog.setTitle("EsaCreator");

                /**
                 * Mengeset komponen dari custom dialog
                 */
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("Versi 1.0.0.1");
                ImageView image = (ImageView) dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                /**
                 * Jika tombol diklik, tutup dialog
                 */
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
