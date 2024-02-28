package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivitylotdetails extends AppCompatActivity {

    Button submitbutton;
    private static final int PICK_FILE_REQUEST = 1;
    private CheckBox termsAndConditionsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylotdetails);

        submitbutton = findViewById(R.id.submitButton);
        Button uploadButton = findViewById(R.id.uploadButton);
        termsAndConditionsCheckBox = findViewById(R.id.termsAndConditionsCheckBox);
        submitbutton.setOnClickListener(v -> Toast.makeText(MainActivitylotdetails.this, "Submit Successfully", Toast.LENGTH_SHORT).show());

        uploadButton.setOnClickListener(v -> {
            // Create an intent to open the file picker
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("*/*");  // Allow all file types
            startActivityForResult(intent, PICK_FILE_REQUEST);
        });



        termsAndConditionsCheckBox.setOnClickListener(v -> {
            if (termsAndConditionsCheckBox.isChecked()) {
                // The user has agreed to the terms and conditions
                Toast.makeText(getApplicationContext(), "You have agreed to the Terms and Conditions", Toast.LENGTH_SHORT).show();
            } else {
                // The user has not agreed to the terms and conditions
                Toast.makeText(getApplicationContext(), "Please accept the Terms and Conditions", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
