package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        Button btn=findViewById(R.id.loginButton);
        btn.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity2.this,MainActivitygogle.class);
            startActivity(intent);
        });


        TextView textViewOpenSecondActivity = findViewById(R.id.signupText);
        textViewOpenSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open SecondActivity
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}