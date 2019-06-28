package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rangpur extends AppCompatActivity {
    Button chinim;
    Button nayabm;
    Button kantazm;
    Button tajpal;
    Button ramdig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);

        chinim = findViewById(R.id.buttoncini);
        chinim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rangpur";
                Test.location = "chinimosque";
                startActivity((new Intent(Rangpur.this,Test.class)));
            }
        });

        nayabm = findViewById(R.id.buttonnayabad);
        nayabm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rangpur";
                Test.location = "NayabadM";
                startActivity((new Intent(Rangpur.this,Test.class)));
            }
        });

        kantazm = findViewById(R.id.buttonkant);
        kantazm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rangpur";
                Test.location = "Kantaz";
                startActivity((new Intent(Rangpur.this,Test.class)));
            }
        });

        tajpal = findViewById(R.id.buttontajh);
        tajpal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rangpur";
                Test.location = "Tajhat";
                startActivity((new Intent(Rangpur.this,Test.class)));
            }
        });

        ramdig = findViewById(R.id.buttonrsagor);
        ramdig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Rangpur";
                Test.location = "Ramsagor";
                startActivity((new Intent(Rangpur.this,Test.class)));
            }
        });

    }
}
