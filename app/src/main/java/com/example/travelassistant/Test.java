package com.example.travelassistant;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.PictureDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Test extends AppCompatActivity {

    TextView description;
    int item = 1;
    ImageView imageView;
    String imageLink,descriptionLink;
    DatabaseReference myRef;
    FirebaseDatabase database;
    public static String division,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);



        if(!isConnected()) {
            new AlertDialog.Builder(this)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .setTitle("Connection Failed")
                    .setMessage("Please check your Internet connection")
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    })
                    .show();
        } else {
           Toast.makeText(Test.this,"Connection Successfull",Toast.LENGTH_LONG).show();
        }


        description = findViewById(R.id.description);
        imageView = findViewById(R.id.viewImage);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();

        myRef.child(division).child(location).addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot child : dataSnapshot.getChildren()) {
                    if (item == 1) {

                        try {
                            int start;
                            int end;
                            start = "About Spot:".length();
                            descriptionLink = child.getValue().toString();
                            end = descriptionLink.indexOf("Travel method:");
                            description.setText("About Spot: \n" + descriptionLink.substring(start, end));

                            start = end + "Travel method:".length();
                            end = descriptionLink.indexOf("Accommodation:");
                            description.setText(description.getText() + "\n\n\nTravel method:\n" + descriptionLink.substring(start, end));

                            start = end + "Accommodation:".length();
                            end = descriptionLink.indexOf("Necessary Contacts:");
                            description.setText(description.getText() + "\n\n\nAccommodation:\n" + descriptionLink.substring(start, end));
                            start = end + "Necessary Contacts:".length();

                            description.setText(description.getText() + "\n\n\nNecessary Contacts:\n" + descriptionLink.substring(start, descriptionLink.length() - 1));
                            item++;
                        }catch (Exception e){

                        }

                        }else if (item == 2) {
                            imageLink = child.getValue().toString();
                            Picasso.get().load(imageLink).into(imageView);

                    }



                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        }

        private boolean isConnected(){

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        return networkInfo != null && networkInfo.isConnected();



    }


}
