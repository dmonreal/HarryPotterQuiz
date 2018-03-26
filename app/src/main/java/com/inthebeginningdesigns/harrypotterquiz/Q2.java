package com.inthebeginningdesigns.harrypotterquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Q2 extends AppCompatActivity {







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Button mCheck = (Button) findViewById(R.id.check);
        Button mNext = (Button) findViewById(R.id.next);
        final RadioButton four = (RadioButton) findViewById(R.id.four);


        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q2.this, Q3.class);
                startActivity(intent);
                finish();
            }
        });

        mCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(four.isChecked()){
                    Toast toast = Toast.makeText(Q2.this, "Outstanding!", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    Toast toast = Toast.makeText(Q2.this, "Try again", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }

}
