package com.example.DAKPA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilCGActivity extends AppCompatActivity {

    TextView txt_nilai,txt_comment;
    Button selesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_c_g);

        txt_nilai = findViewById(R.id.txt_nilai);
        txt_comment = findViewById(R.id.txt_comment);
        selesai = findViewById(R.id.btn_selesai);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));

        if(nilai >= 1) {
            txt_comment.setText("Silahkan lakukan Perika Payudara Secara Klinis berupa Mamografi & USG, Ingat ini gejala");
        }else {
            txt_comment.setText("Anda sehat, jangan lupa lakukan sadari tiap bulan dan sadanis tiap tahun");
        }

        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HasilCGActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}