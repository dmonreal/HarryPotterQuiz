package com.inthebeginningdesigns.harrypotterquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Q4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        final EditText input = findViewById(R.id.answer);
        Button mNext = findViewById(R.id.next);
        Button mCheck = findViewById(R.id.check);

        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q4.this, Closing.class);
                startActivity(intent);
                finish();
            }
        });
 

        mCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.getText().toString();
                if(input.equals("Chamber of Secrets")){
                    Toast toast = Toast.makeText(Q4.this, "AMAZ-ZA-ZING!", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    Toast toast = Toast.makeText(Q4.this, "So close! Try again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
