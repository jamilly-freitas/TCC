package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Calculo4 extends AppCompatActivity {
    Button btnProx4, btnVoltar4;
    RadioGroup rg4;
    RadioButton rbtnSim4, rbtnNao4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo4);

        btnProx4 = findViewById(R.id.btnProx4);
        btnProx4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ultimo.class);
                startActivity(intent);
            }
        });

        btnVoltar4 = findViewById(R.id.btnVoltar4);
        btnVoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo3.class);
                startActivity(intent);
            }
        });
    }
}