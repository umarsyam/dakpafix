package com.example.DAKPA;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public CardView cvCekGejala, cvPencegahan,
//            cvPengaturan,
            cvSadari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvCekGejala = (CardView) findViewById(R.id.cv_cek_gejala);
        cvPencegahan = (CardView) findViewById(R.id.cv_pencegahan);
//        cvPengaturan = (CardView) findViewById(R.id.cv_pengaturan);
        cvSadari = (CardView) findViewById(R.id.cv_sadari);

        cvCekGejala.setOnClickListener(this);
        cvPencegahan.setOnClickListener(this);
//        cvPengaturan.setOnClickListener(this);
        cvSadari.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.cv_cek_gejala :
                i = new Intent(this,CekGejalaActivity.class);
                startActivity(i);
                break;

            case R.id.cv_pencegahan :
                i = new Intent(this, PencegahanActivity.class);
                startActivity(i);
                break;

//            case R.id.cv_pengaturan :
//                i = new Intent(this, PengaturanActivity.class);
//                startActivity(i);
//                break;

            case R.id.cv_sadari :
                i = new Intent(this, MulaiSadariActivity.class);
                startActivity(i);
                break;
        }

    }
}