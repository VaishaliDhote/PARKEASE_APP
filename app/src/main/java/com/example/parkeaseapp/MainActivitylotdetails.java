package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONObject;

public class MainActivitylotdetails extends AppCompatActivity implements PaymentResultListener {

    Button submitbutton;
    private static final int PICK_FILE_REQUEST = 1;
    private CheckBox termsAndConditionsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitylotdetails);

        submitbutton = findViewById(R.id.submitButton);

        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startPayment();
            }
        });




        Button uploadButton = findViewById(R.id.uploadButton);
        termsAndConditionsCheckBox = findViewById(R.id.termsAndConditionsCheckBox);
//        submitbutton.setOnClickListener(v -> Toast.makeText(MainActivitylotdetails.this, "Submit Successfully", Toast.LENGTH_SHORT).show());

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

    public void startPayment() {
        /*
          You need to pass current activity in order to let Razorpay create CheckoutActivity
         */
        final Activity activity = this;

        final Checkout co=new Checkout();
        co.setKeyID("rzp_test_QA2s7TXgncgnKa");
        try {
            JSONObject options = new JSONObject();
            options.put("name", "ParkEase");
            options.put("description", "Demoing Charges");
            options.put("send_sms_hash",true);
            options.put("allow_rotation", true);
            //You can omit the image option to fetch the image from dashboard
            options.put("image", "https://media.istockphoto.com/id/1083622428/vector/car-parking-icon.jpg?s=612x612&w=0&k=20&c=Z6VydNYDHrBq6gujhSuC6eIaCXQn_eMHNBFf8Co0ul4=");
            options.put("currency", "INR");
            options.put("amount", "10000");

            JSONObject preFill = new JSONObject();
            preFill.put("email", "test@razorpay.com");
            preFill.put("contact", "9876543210");

            options.put("prefill", preFill);

            co.open(activity, options);
        } catch (Exception e) {
            Toast.makeText(activity, "Error in payment: " + e.getMessage(), Toast.LENGTH_SHORT)
                    .show();
            e.printStackTrace();
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Toast.makeText(this, "Payment Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {

    }
}


