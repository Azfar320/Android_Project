package com.example.travelassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    public Button buttonsyl;
    public Button buttonchi;
    public Button butt;
    public Button buttonkhu;
    public Button buttonmy;
    public Button buttonaz;
    public Button dhaka;
    public Button buttonbar;
    public Button buttonabout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        buttonaz = (Button) findViewById(R.id.rangpur);
        buttonaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Rangpur = new Intent(MainActivity.this,Rangpur.class);
                startActivity(Rangpur);

            }
        });

        buttonmy = (Button) findViewById(R.id.buttonmy);
        buttonmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mymensingh = new Intent(MainActivity.this,Mymensingh.class);

                startActivity(Mymensingh);
            }
        });

        buttonkhu = (Button) findViewById(R.id.buttonkhu);
        buttonkhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent khulna = new Intent(MainActivity.this,Khulna.class);

                startActivity(khulna);
            }
        });

        butt = (Button) findViewById(R.id.raj);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rajshahi = new Intent(MainActivity.this,Rajshahi.class);

                startActivity(rajshahi);
            }
        });

        buttonchi = (Button) findViewById(R.id.buttonchi);
        buttonchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chittagaon = new Intent(MainActivity.this,Chattagram.class);

                startActivity(chittagaon);
            }
        });

        buttonsyl = (Button) findViewById(R.id.buttonsyl);
        buttonsyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sylhet = new Intent(MainActivity.this,sylhet.class);

                startActivity(sylhet);
            }
        });

        dhaka = (Button) findViewById(R.id.buttondh);
        dhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Dhaka.class));
            }
        });

        buttonbar = (Button) findViewById(R.id.buttonbar);
        buttonbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Barishal.class));
            }
        });

        buttonabout = (Button) findViewById(R.id.buttonabout);
        buttonabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,About.class));
            }
        });




    }
}
