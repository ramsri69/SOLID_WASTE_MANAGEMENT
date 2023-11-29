package com.example.solid_waste_management;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
 String waste;
 int kg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i=getIntent();
        waste=i.getStringExtra("waste");
        kg=i.getIntExtra("kg",0);
        AlertDialog.Builder ad=new AlertDialog.Builder(MainActivity3.this);
        ad.setTitle("Successfull");
        ad.setMessage("Message is sent to the respective department,Thank you!!");
        AlertDialog a=ad.create();
        a.show();

        SmsManager s=SmsManager.getDefault();
        if(waste.equals("Radioactive waste")) {
            s.sendTextMessage("9805643280", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }
        else if(waste.equals("Plastic waste")) {
            s.sendTextMessage("8316729561", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }
        else if(waste.equals("Construction waste")) {
            s.sendTextMessage("9518436148", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }
        else if(waste.equals("Biodegradable waste")) {
            s.sendTextMessage("8451474737", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }
        else if(waste.equals("Hazardous waste")) {
            s.sendTextMessage("9480908453", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }
        else if(waste.equals("Electronic waste")) {
            s.sendTextMessage("8762052817", null, ""+waste+" of " + kg + " kg is generated in the address Sai Palace,flat no2,room no 25,nitte,karkala,udupi", null, null);
        }

    }
}