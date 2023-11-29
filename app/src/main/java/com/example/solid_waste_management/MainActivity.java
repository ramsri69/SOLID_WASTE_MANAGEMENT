package com.example.solid_waste_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView signin=findViewById(R.id.signin);
        EditText username=findViewById(R.id.username);
        EditText password=findViewById(R.id.password);
        MaterialButton login=findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "Login Successfull!!", Toast.LENGTH_SHORT).show();
                    openActivity2();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "wrong password :)", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    public void openActivity2()
    {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}