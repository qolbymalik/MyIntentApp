package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityTerimaObjek extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terima_objek);
        textView = findViewById(R.id.textView);

        MyBiodata myBiodata = getIntent().getParcelableExtra("biodata");
        textView.setText("Nama saya" + myBiodata.getNama() + "Umur saya" + myBiodata.getUmur());


    }
}
