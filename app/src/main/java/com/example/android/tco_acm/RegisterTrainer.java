package com.example.android.tco_acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterTrainer extends AppCompatActivity {
    public Button back,completeReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_trainer);

        back = (Button)findViewById(R.id.back_reg_trainer);
        completeReg = (Button)findViewById(R.id.complete_reg_trainer);

        completeReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterTrainer.this,TrainerProfile.class);
                startActivity(i);
                finish();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegisterTrainer.this,Register1.class);
                startActivity(i);
                finish();
            }
        });
    }
}
