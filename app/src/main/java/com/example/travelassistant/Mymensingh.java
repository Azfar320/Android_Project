package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mymensingh extends AppCompatActivity {

    Button joyn;
    Button shsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh);


        joyn = findViewById(R.id.buttonjoynala);
        joyn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Mymensingh";
                Test.location = "Joynul";
                startActivity((new Intent(Mymensingh.this,Test.class)));
            }
        });

        shsl = findViewById(R.id.buttonsosilaudge);
        shsl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Mymensingh";
                Test.location = "shoshi";
                startActivity((new Intent(Mymensingh.this,Test.class)));
            }
        });
    }
}
