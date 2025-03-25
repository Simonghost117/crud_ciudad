package com.sebas.ejempo.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, Constantes.NAME_BD, null, Constantes.NUM_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constantes.SENTENCIA_TABLA);
        db.execSQL(Constantes.SENTENCIA_TABLA2);
        db.execSQL(Constantes.SENTENCIA_TABLA3);
        db.execSQL(Constantes.SENTENCIA_TABLA6);
        db.execSQL(Constantes.SENTENCIA_TABLA12);
        db.execSQL(Constantes.SENTENCIA_TABLA7);
        db.execSQL(Constantes.SENTENCIA_CUENTABANCARIA);
        db.execSQL(Constantes.SENTENCIA_TABLA10);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
