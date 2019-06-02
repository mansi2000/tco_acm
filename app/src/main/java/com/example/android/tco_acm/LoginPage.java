package com.example.android.tco_acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    private Button mSendData, register1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);


        mSendData = (Button)findViewById(R.id.login_btn);
        register1 = (Button)findViewById(R.id.register_btn);
        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginPage.this, TrainerProfile.class);
                startActivity(i);
                finish();
            }
        });
        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginPage.this, Register1.class);
                startActivity(i);
                finish();
            }
        });


    }
}