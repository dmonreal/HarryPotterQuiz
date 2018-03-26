package com.inthebeginningdesigns.harrypotterquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Q1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        Button mNext = findViewById(R.id.next);
        Button mCheck = findViewById(R.id.check);
        final RadioButton seamus = findViewById(R.id.seamus);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q1.this, Q2.class);
                startActivity(intent);
                finish();
            }
        });


        mCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (seamus.isChecked()) {
                    Toast toast = Toast.makeText(Q1.this, "Awesome job!", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(Q1.this, "Please try again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}