package com.example.salsa.platform05fcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String judul,deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi textview untuk menampilkan pesan notifikasi
        if (judul != null && deskripsi != null) {
            TextView jud = (TextView) findViewById(R.id.tv1);
            TextView des = (TextView) findViewById(R.id.tv2);

            jud.setText(judul);
            des.setText(deskripsi);
        }
    }
}
