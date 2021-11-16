package com.example.activity.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class AppOpenHelper extends SQLiteOpenHelper {
    public AppOpenHelper(@Nullable Context context) {
        super(context, "app", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ScriptSQL.getCreateTableUsuario());
        db.execSQL(ScriptSQL.getCreateTablePropriedade());
        db.execSQL(ScriptSQL.getCreateTableBioma());
        db.execSQL(ScriptSQL.getCreateTablePlantas());
        db.execSQL(ScriptSQL.getCreateTablePlanta_Bioma());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
