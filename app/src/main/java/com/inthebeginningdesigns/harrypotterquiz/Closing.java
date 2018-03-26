package com.inthebeginningdesigns.harrypotterquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Closing extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closing);
        Button mStartAgain = findViewById(R.id.startAgain);
        mStartAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Closing.this,Q1.class );
                startActivity(intent);
                finish();
            }
        });
    }
}
