package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chattagram extends AppCompatActivity {

    Button coxs;
    Button sajek;
    Button nillg;
    Button smar;
    Button kapl;
    Button dhaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattagram);


        coxs = findViewById(R.id.buttoncbz);
        coxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Coxs Bazar";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });

        sajek = findViewById(R.id.buttonsjk);
        sajek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Sajekv";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });

        nillg = findViewById(R.id.buttonnlg);
        nillg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Nilgiri";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });

        smar = findViewById(R.id.buttonsmn);
        smar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Saint Mart";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });

        kapl = findViewById(R.id.buttonkaptai);
        kapl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Kaptai Lake";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });

        dhaz = findViewById(R.id.buttondula);
        dhaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Chattagram";
                Test.location = "Dula Hazra";
                startActivity((new Intent(Chattagram.this,Test.class)));
            }
        });
    }
}
