package com.inthebeginningdesigns.harrypotterquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_q3);
        Button mNext = findViewById(R.id.next);
        Button mCheck = findViewById(R.id.check);

        final CheckBox c = findViewById(R.id.c);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q3.this, Q4.class);
                startActivity(intent);
                finish();
            }
        });
        mCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c.isChecked()){
                    Toast toast = Toast.makeText(Q3.this, "So close, try again", Toast.LENGTH_SHORT);
                    toast.show();
                }else {
                    Toast toast = Toast.makeText(Q3.this, "Great job", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
