package com.sebas.ejempo.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Constantes  {
    public static String NAME_BD ="ejemplobd";
    public static  int NUM_VERSION = 1;
    public static String SENTENCIA_TABLA = "create table Ciudad(codigo integer, nombre text)";
    public static String SENTENCIA_TABLA2 = "create table Departamento(codigo integer, nombre text)";
    public static String SENTENCIA_TABLA6 = "create table Paciente(idpaciente integer, nombre text, correo varchar, dirección varchar)";

}
