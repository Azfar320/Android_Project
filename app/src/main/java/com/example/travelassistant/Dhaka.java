package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dhaka extends AppCompatActivity {
    Button blg;
    Button trm;
    Button lbk;
    Button nhp;
    Button dkm;
    Button shg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        blg = findViewById(R.id.dhakaBoldha);
        blg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "Boldhag";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });

        trm = findViewById(R.id.dhakaStar);
        trm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "TaraM";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });

        lbk = findViewById(R.id.dhakaLal);
        lbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "Lalbag";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });

        nhp = findViewById(R.id.dhakaNuash);
        nhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "Nuhash";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });

        dkm = findViewById(R.id.dhakaMondir);
        dkm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "Dhakeswari";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });

        shg = findViewById(R.id.sonargaon);
        shg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Dhaka";
                Test.location = "Sonard";
                startActivity((new Intent(Dhaka.this,Test.class)));
            }
        });
    }
}



