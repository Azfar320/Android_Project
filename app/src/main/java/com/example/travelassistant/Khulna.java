package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Khulna extends AppCompatActivity {
    Button Khanali;
    Button lalonma;
    Button kutib;
    Button sixtdo;
    Button mansun;
    Button hirpo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        Khanali = findViewById(R.id.buttonkhan);
        Khanali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "Khanjahand";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });

        lalonma = findViewById(R.id.buttonlalons);
        lalonma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "lalonshah";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });

        kutib = findViewById(R.id.buttonrabku);
        kutib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "Shilaidaha";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });

        sixtdo = findViewById(R.id.buttonsdm);
        sixtdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "SixtyD";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });

        mansun = findViewById(R.id.buttonsundb);
        mansun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "Mangrove";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });

        hirpo = findViewById(R.id.buttonhiran);
        hirpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Khulna";
                Test.location = "Hiran";
                startActivity((new Intent(Khulna.this,Test.class)));
            }
        });
    }
}



