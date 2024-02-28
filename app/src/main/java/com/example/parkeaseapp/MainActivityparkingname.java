package com.example.parkeaseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityparkingname extends AppCompatActivity {

    TextView boxx1;
    TextView boxx2;
    TextView boxx3;
    TextView boxx4;
    TextView boxx5;
    TextView boxx6;
    TextView boxx7;
    TextView boxx8;
    TextView boxx9;

    TextView sboxx1;
    TextView sboxx2;
    TextView sboxx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityparkingname);


        boxx1=findViewById(R.id.box1);
        boxx2=findViewById(R.id.box2);
        boxx3=findViewById(R.id.box3);
        boxx4=findViewById(R.id.box4);
        boxx5=findViewById(R.id.box5);
        boxx6=findViewById(R.id.box6);
        boxx7=findViewById(R.id.box7);
        boxx8=findViewById(R.id.box8);
        boxx9=findViewById(R.id.box9);
        sboxx1=findViewById(R.id.sbox1);
        sboxx2=findViewById(R.id.sbox2);
        sboxx3=findViewById(R.id.sbox3);


        boxx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor1();
            }
        });


        boxx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor2();
            }
        });


        boxx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor3();
            }
        });

        boxx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor4();
            }
        });

        boxx5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor5();
            }
        });

        boxx6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor6();
            }
        });

        boxx7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor7();
            }
        });

        boxx8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor8();
            }
        });

        boxx9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor9();
            }
        });

        sboxx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor11();
            }
        });

        sboxx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor12();
            }
        });

        sboxx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change the color when clicked
                changeBoxColor13();
            }
        });
    }


    private void changeBoxColor1() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx1.setBackgroundColor(newColor);
    }

    private void changeBoxColor2() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx2.setBackgroundColor(newColor);
    }

    private void changeBoxColor3() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx3.setBackgroundColor(newColor);
    }

    private void changeBoxColor4() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx4.setBackgroundColor(newColor);
    }

    private void changeBoxColor5() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx5.setBackgroundColor(newColor);
    }

    private void changeBoxColor6() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx6.setBackgroundColor(newColor);
    }

    private void changeBoxColor7() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx7.setBackgroundColor(newColor);
    }

    private void changeBoxColor8() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx8.setBackgroundColor(newColor);
    }

    private void changeBoxColor9() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        boxx9.setBackgroundColor(newColor);
    }

    private void changeBoxColor11() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        sboxx1.setBackgroundColor(newColor);
    }

    private void changeBoxColor12() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        sboxx2.setBackgroundColor(newColor);
    }

    private void changeBoxColor13() {
        // Change the background color to a different color
        int newColor = Color.parseColor("#FF0000"); // You can replace this with your desired color
        sboxx3.setBackgroundColor(newColor);
    }
}