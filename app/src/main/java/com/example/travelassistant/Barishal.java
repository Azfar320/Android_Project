package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Barishal extends AppCompatActivity {

    Button bibicin;
    Button chark;
    Button fatch;
    Button kuakata;
    Button lebubo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barishal);

        bibicin = findViewById(R.id.barBibi);
        bibicin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Barishal";
                Test.location = "Bibicini";
                startActivity((new Intent(Barishal.this,Test.class)));
            }
        });

        chark = findViewById(R.id.barChar);
        chark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Barishal";
                Test.location = "Charkuk";
                startActivity((new Intent(Barishal.this,Test.class)));
            }
        });

        fatch = findViewById(R.id.barFatra);
        fatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Barishal";
                Test.location = "Fatrar";
                startActivity((new Intent(Barishal.this,Test.class)));
            }
        });

        kuakata = findViewById(R.id.barKuakata);
        kuakata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Barishal";
                Test.location = "Kuakata";
                startActivity((new Intent(Barishal.this,Test.class)));
            }
        });

        lebubo = findViewById(R.id.barLebu);
        lebubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Barishal";
                Test.location = "Lebu";
                startActivity((new Intent(Barishal.this,Test.class)));
            }
        });

    }
}
