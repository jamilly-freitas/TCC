package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Calculo2 extends AppCompatActivity {
    Button btnProx2, btnVoltar2;
    RadioGroup rg2;
    RadioButton rbtnSim2, rbtnNao2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo2);

        btnProx2 = findViewById(R.id.btnProx2);
        btnProx2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo3.class);
                startActivity(intent);
            }
        });

        btnVoltar2 = findViewById(R.id.btnVoltar2);
        btnVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo1.class);
                startActivity(intent);
            }
        });
    }
}