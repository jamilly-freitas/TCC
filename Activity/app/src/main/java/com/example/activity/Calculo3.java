package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Calculo3 extends AppCompatActivity {
    Button btnProx3, btnVoltar3;
    RadioGroup rg3;
    RadioButton rbtnSim3, rbtnNao3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo3);

        btnProx3 = findViewById(R.id.btnProx3);
        btnProx3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo4.class);
                startActivity(intent);
            }
        });

        btnVoltar3 = findViewById(R.id.btnVoltar3);
        btnVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo2.class);
                startActivity(intent);
            }
        });
    }
}