package com.example.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.activity.database.AppOpenHelper;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    Button btnCalculo, btnArl, btnAur, btnOpc;

    private SQLiteDatabase conexao;
    private AppOpenHelper appOpenHelper;
    private ConstraintLayout layoutMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutMain = (ConstraintLayout)findViewById(R.id.layoutMain);
        criarConexao();


        btnCalculo = findViewById(R.id.btnCalculo);
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo1.class);
                startActivity(intent);
            }
        });

        btnArl = findViewById(R.id.btnArl);
        btnArl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Arl.class);
                startActivity(intent);
            }
        });

        btnAur = findViewById(R.id.btnAur);
        btnAur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Aur.class);
                startActivity(intent);
            }
        });

        btnOpc = findViewById(R.id.btnOpc);
        btnOpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Opcoes.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.itemCalAnterior:

                Intent intent = new Intent(getApplicationContext(), Objetivo.class);
                startActivity(intent);

                break;
            case R.id.itemObjetivo:

                Intent intent2 = new Intent(getApplicationContext(), Objetivo.class);
                startActivity(intent2);

                break;
            case R.id.itemInformacoes:

                Intent intent3 = new Intent(getApplicationContext(), Objetivo.class);
                startActivity(intent3);

                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void criarConexao(){
        try {
            appOpenHelper = new AppOpenHelper(this);
            conexao = appOpenHelper.getWritableDatabase();

            Snackbar.make(layoutMain, "Conexão realizada!", Snackbar.LENGTH_SHORT)
                    .setAction("Ok", null).show();
        }
        catch (SQLException ex){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Erro!");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("OK",null);
            dlg.show();
        }
    }
}