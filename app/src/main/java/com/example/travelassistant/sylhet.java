package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sylhet extends AppCompatActivity {

    Button bisna;
    Button jaf;
    Button lawa;
    Button madhabk;
    Button madlake;
    Button tahir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        bisna = findViewById(R.id.buttonbisna);
        bisna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Test.division = "Sylhet";
                 Test.location = "BisnaKandi";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });

        jaf = findViewById(R.id.buttonjaf);
        jaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Sylhet";
                Test.location = "Jaflong";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });

        lawa = findViewById(R.id.buttonlaw);
        lawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Sylhet";
                Test.location = "Lawachara";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });

        madhabk = findViewById(R.id.buttonmadh);
        madhabk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Sylhet";
                Test.location = "MadhabKunda Waterfall";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });

        madlake = findViewById(R.id.buttonlake);
        madlake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Sylhet";
                Test.location = "Madhabpur Lake";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });

        tahir = findViewById(R.id.buttonshml);
        tahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Test.division = "Sylhet";
                Test.location = "Tahirpur shimul garden";
                startActivity((new Intent(sylhet.this,Test.class)));
            }
        });



    }
}
