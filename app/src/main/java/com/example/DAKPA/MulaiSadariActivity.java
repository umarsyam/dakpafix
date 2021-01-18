package com.example.DAKPA;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MulaiSadariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai_sadari);

        Button btnMulaiSadari = findViewById(R.id.btnMulaiSadari);
        btnMulaiSadari.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mulaiSadari();
            }
        });
    }

    private void mulaiSadari(){
        Intent intent = new Intent(MulaiSadariActivity.this, SadariActivity.class);
        startActivity(intent);
    }
}