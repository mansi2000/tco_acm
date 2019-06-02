package com.example.android.tco_acm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register1 extends AppCompatActivity {
    public Button learnerReg,trainerReg,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        learnerReg = (Button)findViewById(R.id.btn_learner_reg);
        trainerReg = (Button)findViewById(R.id.btn_trainer_reg);
        back = (Button)findViewById(R.id.back_regf);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register1.this, LoginPage.class);
                startActivity(i);
                finish();
            }
        });

        learnerReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register1.this, RegisterStudent.class);
                startActivity(i);
                finish();
            }
        });

        trainerReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Register1.this, RegisterTrainer.class);
                startActivity(i);
                finish();
            }
        });
    }
}
