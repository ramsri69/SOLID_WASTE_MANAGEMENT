package com.example.solid_waste_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    RadioGroup r;
    Button b1,b2;
    EditText k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        r=findViewById(R.id.r);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.p3);
        k=findViewById(R.id.k);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=r.getCheckedRadioButtonId();
                if(id==-1)
                {
                    Toast.makeText(MainActivity10.this, "Type of waste is not selected", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    RadioButton f=findViewById(id);
                    String s=f.getText().toString();
                    int kg=Integer.parseInt(k.getText().toString());
                    Toast.makeText(MainActivity10.this, "Selected waste:"+s, Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(MainActivity10.this,MainActivity3.class);
                    i.putExtra("waste",s);
                    i.putExtra("kg",kg);
                    startActivity(i);

                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity10.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}
