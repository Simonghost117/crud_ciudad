package com.sebas.ejempo.controller;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sebas.ejempo.R;

import com.sebas.ejempo.model.DbHelper;

public class MainActivity extends AppCompatActivity {
    DbHelper conexion;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexion = new DbHelper(MainActivity.this);
        db = conexion.getWritableDatabase();
        Toast.makeText(this, "base de datos creada", Toast.LENGTH_SHORT).show();

    }
}