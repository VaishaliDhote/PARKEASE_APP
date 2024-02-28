package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivityownerReg extends AppCompatActivity {
    Button submitbutton;
    private static final int PICK_FILE_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityowner_reg);
        submitbutton=findViewById(R.id.submitButton);
        Button uploadButton = findViewById(R.id.uploadButton);


        Button submitbutton=findViewById(R.id.submitButton);
        submitbutton.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivityownerReg.this,MainActivitylotdetails.class);
            startActivity(intent);
        });

        uploadButton.setOnClickListener(v -> {
            // Create an intent to open the file picker
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");  // Allow all file types
            startActivityForResult(intent, PICK_FILE_REQUEST);
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}