package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calculo1 extends AppCompatActivity {
    Button btnProx1, btnVoltar1;
    RadioButton rbtnSim1, rbtnNao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo1);

        rbtnSim1 = findViewById(R.id.rbtnSim1);
        rbtnNao1 = findViewById(R.id.rbtnNao1);

        btnProx1 = findViewById(R.id.btnProx1);
        btnProx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo2.class);
                startActivity(intent);
            }
        });

        btnVoltar1 = findViewById(R.id.btnVoltar1);
        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}