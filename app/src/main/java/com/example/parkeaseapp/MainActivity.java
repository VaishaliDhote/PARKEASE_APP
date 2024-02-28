package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Button userbutton;
    Button ownerbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userbutton=findViewById(R.id.userButton);
        ownerbutton=findViewById(R.id.ownerButton);
//        ownerbutton.setOnClickListener(v -> Toast.makeText(MainActivity2.this,"Clicked",Toast.LENGTH_SHORT).show());
//        userbutton.setOnClickListener(v -> Toast.makeText(MainActivity2.this,"Clicked",Toast.LENGTH_SHORT).show());

        Button bttn=findViewById(R.id.userButton);
        bttn.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        });

        Button bttnn=findViewById(R.id.ownerButton);
        bttnn.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,MainActivityownerReg.class);
            startActivity(intent);
        });
    }
}