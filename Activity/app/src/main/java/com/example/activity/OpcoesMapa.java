package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OpcoesMapa extends AppCompatActivity {
    Button btnVoltar8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_mapa);

        btnVoltar8 = findViewById(R.id.btnVoltar8);
        btnVoltar8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Opcoes.class);
                startActivity(intent);
            }
        });
    }
}