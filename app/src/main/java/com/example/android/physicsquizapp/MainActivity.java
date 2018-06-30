package com.example.android.physicsquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    RadioGroup q1Group;
    RadioGroup q2Group;
    RadioGroup q3Group;
    RadioGroup q4Group;
    RadioGroup q5Group;

    RadioButton answer1;
    RadioButton answer2;
    RadioButton answer3;
    RadioButton answer4;
    RadioButton answer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        q1Group = findViewById(R.id.G1);
        q2Group = findViewById(R.id.G2);
        q3Group = findViewById(R.id.G3);
        q4Group = findViewById(R.id.G4);
        q5Group = findViewById(R.id.G5);

        Button submit_Button = findViewById(R.id.submit_Button);
        submit_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        public void radioButtonClick1 (View view){

            int radioId1 = q1Group.getCheckedRadioButtonId();

            answer1 = findViewById(radioId1);
            switch (answer1){
                case Q1_A:
                    if (radioId1)
                        score+=1;
                    break;

            }

        }
    }

}

