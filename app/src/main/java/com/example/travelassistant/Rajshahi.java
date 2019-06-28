package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rajshahi extends AppCompatActivity {
    Button chotom;
    Button mazarshah;
    Button natoreraj;
    Button praj;
    Button mahas;
    Button gokul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);

        chotom = findViewById(R.id.rajChotoSona);
        chotom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "Chotosona";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });

        mazarshah = findViewById(R.id.rajMakh);
        mazarshah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "SahMakh";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });

        natoreraj = findViewById(R.id.rajNatore);
        natoreraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "NatoreRaj";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });

        praj = findViewById(R.id.rajPuthia);
        praj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "PuthiaRaj";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });

        mahas = findViewById(R.id.rajMaha);
        mahas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "Mahasthan";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });

        gokul = findViewById(R.id.rajGm);
        gokul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rajshahi";
                Test.location = "Gokul";
                startActivity((new Intent(Rajshahi.this,Test.class)));
            }
        });
    }
}

